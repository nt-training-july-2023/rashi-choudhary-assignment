import React, { useEffect, useState } from "react";
import { BrowserRouter, NavLink, Route, Routes } from "react-router-dom";
import { checkEmail, signUp } from "../Services/registration-service";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import "../Style/Registration.css"
function Registration() {


    const initialValues = { name: "", username: "", email: "", phonenumber: "", password: "", confirmpassword: "" };
    const [formValues, setFormValues] = useState(initialValues);
    let check = true;

    const [gender, setGender] = useState('');

    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormValues({ ...formValues, [name]: value });
    };
    const emailAlreadyPresent = () => {
        toast("Email already Registered, try a new email");
    }

    const  handleSubmit = (e) => {
        e.preventDefault();
        validate(formValues);
        if (check) {
            const params = {
                name: formValues.name,
                username: formValues.username,
                email: formValues.email,
                password: formValues.password,
                phonenumber: formValues.phonenumber,
                gender: gender
            }

            signUp(params).then((resp) => {
                console.log(resp);
                console.log("success log");
                RegSuccess();
                // const RegSuccess=()=>{
                //     <ToastContainer><button onClick={notify}>Notify!</button></ToastContainer>
                // }
            }).catch((error) => {
                console.log(error)
                console.log("Error log")

            })
            const RegSuccess = () => {

                toast("Registration success");

            };

        }



    }




    const validate = (values) => {

        const emailRegex = /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$/i;
        const phoneRegex = /^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$/i;
        const passwordRegex = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,16}$/;
        if (!values.name) {
            check = false;
            document.getElementById("Cname").innerHTML = "Name is required";

        }
        if (!values.username) {
            check = false;
            document.getElementById("Cusername").innerHTML = "User Name is required";

        }
        if (!values.email) {
            check = false;
            document.getElementById("Cemail").innerHTML = "Email is required";

        } else {
            if (!emailRegex.test(values.email)) {
                document.getElementById("Cemail").innerHTML = "Syntax is not right";
            }
            else {


                checkEmail(values.email).then((resp) => {
                    console.log(resp);
                }).catch((error) => {
                    console.log(error)
                    check = false;
                    console.log("In ...");
                    emailAlreadyPresent();
                    console.log("Error log")


                })
            }
        }
        if (!values.phonenumber) {
            check = false;
            document.getElementById("Cphonenumber").innerHTML = "Phone Number is required";
        } else if (!phoneRegex.test(values.phonenumber)) {
            document.getElementById("Cphonenumber").innerHTML = "Syntax is not right";
        }
        if (!values.password) {
            check = false;
            document.getElementById("Cpassword").innerHTML = "Password is required";
        } else if (!passwordRegex.test(values.password)) {
            document.getElementById("Cpassword").innerHTML = "Syntax is not right";
        }
        if (!values.confirmpassword) {
            check = false;
            document.getElementById("Cconfirmpassword").innerHTML = "Confirm Password is required";
        } else if (values.password !== values.confirmpassword) {
            check = false;
            document.getElementById("Cconfirmpassword").innerHTML = "Password did not match";
        }

        if (gender === '') {
            check = false;
            document.getElementById("Cconfirmgender").innerHTML = "Gender is required";
        }


    };

    return (
        <>
            <div className="reg">
                <div className="big-container">
                    <div className="containerr">
                        <form onSubmit={handleSubmit}>
                            <h2>Registration</h2>
                            <div className="content">
                                <div className="input-box">
                                    <label for="name">Full Name</label>
                                    <input type="text" placeholder="Enter your name" id="name" name="name"
                                        value={formValues.name}
                                        onChange={handleChange} />
                                    <span id="Cname" style={{ color: 'red', fontSize: '14px' }} ></span>
                                </div>


                                <div className="input-box">
                                    <label for="Username">Username</label>
                                    <input type="text" placeholder="Enter your username" id="username" name="username" value={formValues.username} onChange={handleChange} />
                                    <span id="Cusername" style={{ color: 'red', fontSize: '14px' }} ></span>
                                </div>

                                <div className="input-box">
                                    <label for="Email">Email</label>
                                    <input placeholder="Enter your email" id="email" name="email" value={formValues.email} onChange={handleChange} />
                                    <span id="Cemail" style={{ color: 'red', fontSize: '14px' }} ></span>
                                </div>

                                <div className="input-box">
                                    <label for="phonenumber">Phone Number</label>
                                    <input type="tel" pattern="[789][0-9]{9}" placeholder="Enter phone number" id="phonenumber" name="phonenumber" value={formValues.phonenumber} onChange={handleChange} />
                                    <span id="Cphonenumber" style={{ color: 'red', fontSize: '14px' }} ></span>
                                </div>

                                <div className="input-box">
                                    <label for="Password">Password</label>
                                    <input type="password" pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,12}$" placeholder="Enter your password" name="password" id="password" value={formValues.password} onChange={handleChange} />
                                    <span id="Cpassword" style={{ color: 'red', fontSize: '14px' }} ></span>
                                </div>

                                <div className="input-box">
                                    <label for="confirmpassword">Confirm Password</label>
                                    <input type="password" placeholder="Confirm Password" name="confirmpassword" id="confirmpassword" value={formValues.confirmpassword} onChange={handleChange} />
                                    <span id="Cconfirmpassword" style={{ color: 'red', fontSize: '14px' }} ></span>
                                </div>

                                <span className="gender-title">Gender</span>
                                <div className="gender-category">
                                    <input type="radio" name="gender" id="male" checked={gender === 'male'} onChange={() => setGender('male')} />
                                    <label for="gender">Male</label>
                                    <input type="radio" name="gender" id="female" checked={gender === 'female'} onChange={() => setGender('female')} />
                                    <label for="gender">Female</label>
                                    <input type="radio" name="gender" id="Prefernottosay" checked={gender === 'prefer not to say'} onChange={() => setGender('prefer not to say')} />
                                    <label for="gender">Prefer not to say</label>
                                    <span id="Cconfirmgender" style={{ color: 'red', fontSize: '14px' }} ></span>
                                </div>
                            </div>
                            <div className="button-container">
                                <button type="submit " onClick={handleSubmit}>Register</button>
                            </div>
                            <ToastContainer />
                        </form>
                        <NavLink to="login">Already have an account</NavLink>

                    </div>
                </div>
            </div>
        </>

    );

}
export default Registration;