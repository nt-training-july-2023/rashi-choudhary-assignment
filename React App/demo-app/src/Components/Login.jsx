import React, { useState } from "react";
import '../Style/Login.css'
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import { signIn } from "../Services/registration-service";
function Login() {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [isLogin, setIsLogin] = useState(false);
    let check = 'true';
    const handleEmailChange = (e) => {

        setEmail(e.target.value);
        console.log(e.target)


    }
    const LoginSuccess = () => {

        toast.success("Login success");

    };
    const LoginFail =()=>{
    toast.error("Incorrect details");
    }
    const handlePasswordChange = (e) => {
        setPassword(e.target.value);
    }
    const handleSubmit = () => {


        validate(email, password);
        if (check) {

            const param = {
                email: email,
                password: password
            }
            signIn(param).then((resp) => {
                console.log(resp);
                // console.log("success log");
                if (resp.status === 201) {
                    setIsLogin(true);
                    LoginSuccess();
                }

            }).catch((error) => {
                console.log(error)
                console.log("Error log")
                LoginFail();

            })

        }

    }
    const validate = (email, password) => {
        console.log(email);

        if (email === '') {
            alert("email is required");
            check = 'false';
        }
        if (password === '') {
            alert("password is required");
            check = 'false';
        }

    }
    return (
        <>
            <div className="loginBody">
                <div className="login-middle-container">
                    <h2>Login</h2>
                    <div className="login-content-container">

                        <div className="login-input-box">
                            <label for="Email">Email</label>
                            <input placeholder="Enter your email" id="email" name="email" value={email} onChange={(e) => handleEmailChange(e)} />
                            <span id="Cemail" style={{ color: 'red', fontSize: '14px' }} ></span>
                        </div>
                        <div className="login-input-box">
                            <label for="Password">Password</label>
                            <input type="password" placeholder="Enter your password" name="password" id="password" value={password} onChange={(e) => handlePasswordChange(e)} />
                            <span id="Cpassword" style={{ color: 'red', fontSize: '14px' }} ></span>
                        </div>
                        <div className="login-button-container">
                            <button type="submit" onClick={handleSubmit}>Login</button>
                        </div>
                        <ToastContainer />
                    </div>

                </div>
            </div>
        </>

    );
}
export default Login;