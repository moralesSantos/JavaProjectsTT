import { initializeApp } from "firebase/app";
import 'firebase/auth'; 
import 'firebase/firestore'; 


const firebaseConfig = {
    apiKey: "AIzaSyCpanZrt2uJ3U_6wJ7gskYvxtMgEr3lfvY",
    authDomain: "login-89579.firebaseapp.com",
    databaseURL: "https://login-89579-default-rtdb.firebaseio.com/",
    projectId: "login-89579",
    storageBucket: "login-89579.appspot.com",
    messagingSenderId: "472584005500",
    appId: "1:472584005500:web:771f26e6498a3d3fe7e6f9"
  };

  const fire = initializeApp(firebaseConfig); 
  export const auth = fire.auth(); 

  

  export default fire; 