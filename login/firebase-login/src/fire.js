import { initializeApp } from "firebase/app";
import 'firebase/auth'; 
import 'firebase/firestore'; 


const firebaseConfig = {
   //config goes here
  };

  const fire = initializeApp(firebaseConfig); 
  export const auth = fire.auth(); 

  

  export default fire; 
