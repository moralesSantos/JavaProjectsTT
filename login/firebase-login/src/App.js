import React, {useState, useEffect} from 'react';
import fire from './fire'; 
import Login from './Login';
import Hero from './Hero'; 
import './App.css';
import { Auth } from '@firebase/auth';

const App = () => {
  const [user, setUser] = useState(''); 
  const [email, setEmail] = useState(''); 
  const [password, setPassword] = useState(''); 
  const [emailError, setEmailError] = useState(''); 
  const [passwordError, setPasswordError] = useState('');
  const [hasAccount, setHasAccount] =useState(false); 
  

  const clearInputs = () => {
    setEmail(''); 
    setPassword(''); 
  }

  const clearErrors = () => {
    setEmailError(''); 
    setPasswordError(''); 
  }

  const handleLogin = () => {
    clearErrors(); 
    fire
    .auth()
    .signInWithEmailAndPassWord(email, password)
    .catch((err) => {
      switch(err.code){
        case "auth/invalid-email":
        case "auth/user-disabled":
        case "auth/user-not-found":
          setEmailError(err.message);
          break; 
          case "auth/wrong-password": 
            setPasswordError(err.message); 
            break; 
      }
    }); 
  }; 

  const handleSignUp = () => {
    clearErrors(); 
    fire
    .auth()
    .createUserWithEmailAndPassWord(email, password)
    .catch((err) => {
      switch(err.code){
        case "auth/invalid-email":
        case "auth/user-disabled":
          case "auth/email-already-in-use":
          case "auth/invalid-email":
          setEmailError(err.message);
          break; 
          case "auth/weak-password": 
            setPasswordError(err.message); 
            break; 
      }
    }); 
  };


  const handleLogOut = () => {
    fire.auth().signOut(); 
  }; 

  const authListner = () => {
    fire.auth().onAuthStateChanged((user)=> {
      if (user) {
        clearInputs(); 
        setUser(user); 
      } else {
        setUser(""); 
      }
    }); 
  };
  
  useEffect(()=> {
    authListner(); 
  }, []); 


  return (
   <div className="App">
     {user ? (
       <Hero handleLogOut={handleLogOut}/>
     ): (
    <Login 
      email = {email} 
      setEmail={setEmail} 
      password={password} 
      setPassword={setPassword} 
      handleLogin={handleLogin}
      handleSignUp={handleSignUp} 
      hasAccount={hasAccount} 
      setHasAccount = {setHasAccount}
      emailError = {emailError}
      passwordError={passwordError}
      />
     )}
   </div>
  );
}; 

export default App;
