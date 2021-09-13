import React, {useState, useEffect} from 'react';
import firebase from 'firebase/compat/app';
import 'firebase/compat/auth';
import 'firebase/compat/firestore'; 
import Button from './Button';
import Channel from './Channel'; 


firebase.initializeApp({
  apiKey: "AIzaSyAUVonQ4pIar_quFjsM-ra_zX6rGKx71NM",
  authDomain: "fire-chat-9d47d.firebaseapp.com",
  projectId: "fire-chat-9d47d",
  storageBucket: "fire-chat-9d47d.appspot.com",
  messagingSenderId: "776913017414",
  appId: "1:776913017414:web:633fefdd185945a28b0847"
}); 

const auth = firebase.auth(); 
const db = firebase.firestore(); 

function App() {
  
  const [user, setUser] = useState(()=> auth.currentUser); 
  const [initializing, setInitializing] = useState(true);

  useEffect(() => {
    const unsubscribe = firebase.auth().onAuthStateChanged(user => {
      if (user) {
        setUser(user);
      } else {
        setUser(false);
      }
      if (initializing) {
        setInitializing(false);
      }
    });

    return unsubscribe;
  }, [initializing]);


 // Retrieve Google provider object
  const signInWithGoogle = async () => {
    const provider = new firebase.auth.GoogleAuthProvider();
    auth.useDeviceLanguage(); 
    try{
      await auth.signInWithPopup(provider); 
    } catch(error){
      console.log(error); 
    }
  };


  const signOut = async () => {
    try {
      await firebase.auth().signOut(); 
    } catch (error){
      console.log(error.message); 
    }
  };

  if(initializing) return "logging out..."; 

  return (
    <div>
      {user ?(
        <>
        <Button onClick={signOut}>Sign out</Button>
        <Channel user={user} db = {db} />
        </>
        ) : ( 
        <Button onClick={signInWithGoogle}>Sign in with Google</Button>
        )}
    </div>
  );
}

export default App;