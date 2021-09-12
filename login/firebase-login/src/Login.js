import React from "react";

const Login = (props) => {
    const  {
        email,
        setEmail,
        password,
        setPassword,
        handleLogin,
        handleSignUp,
        hasAccount,
        setHasAccount,
        emailError,
        passwordError
    } = props; 

    return (
        <section className = "login" >
            <div className = "loginContainer">
                <label>UserName</label>
                <input 
                    type="text" 
                    autoFocus 
                    required 
                    value={email}
                    onChange={(e)=> setEmail(e.target.value)} 
                />
                <p className="errorMsg">{emailError}</p>
                <label>password</label>
                <input 
                    type="password"
                    required
                    value={password}
                    onChange={(e)=>setPassword(e.target.value)}    
                />
                <p className="errorMsg">{passwordError}</p>
                <div className= "btnContainer"> 
                    {hasAccount ? (
                      <div>
                      <button onClick={handleLogin}>Sign In</button> 
                      <p>Dont have an account ? <span onClick={()=>setHasAccount(!hasAccount)}>Sign In</span> </p>
                      </div>
                    ) : (
                        <div>
                        <button onClick={handleSignUp}>SignUp</button>
                        <p>Have an account ? <span onClick={()=>setHasAccount(!hasAccount)}>Sign In</span></p>
                        </div>
                    )}

                </div>
            </div>            
        </section>
    )
}

export default Login; 