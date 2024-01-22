import React, {useEffect, useState} from 'react'
import { Navbar } from 'react-bootstrap'
import { Link } from 'react-router-dom'
import './AuthPage.css'
import axios from 'axios'
//import navbar from './navbar'


export const SignupPage = () => {

    const handleClick = async () => {

        try {
            const firstName = document.getElementById('fname').value;
            const lastName = document.getElementById('lname').value;
            const email = document.getElementById('email').value;
            const password = document.getElementById('password').value;

            const response = await axios.post('http://localhost:8080/usr/user', {
                firstname: firstName,
                lastname: lastName,
                email: email,
                password: password,
                role: "user",
            });
            console.log(response.data);
            //console.log("should set user on next line")
            //setUserId(response.data? true : false);
            //setUser(response.data);
            console.log("ran")
            setUser(response.data);
            setUserId(response.data?.id);
            console .log("set user")
            console.log("user: ", user)

            sessionStorage.setItem('userId', response.data?.id);
            sessionStorage.setItem('userName', response.data?.firstname);

        } catch (error) {
            console.error(error);
        }

    };
    const [user, setUser] = useState();
    const [userId, setUserId] = useState(null);

    useEffect(() => {
        
        console.log("Changed user: ", user)

        !user && console.log("User not logged in");
        user && console.log("User logged in");


        user && window.location.replace("http://localhost:3000");

    }, [userId])

    return (
        <div className='authpage'>
            <Navbar reloadnavbar={false}/>

            <div className='authcont'>
                <img src='https://images.unsplash.com/photo-1495480137269-ff29bd0a695c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1172&q=80'
                    alt='signup' />

                <form className='authform' onSubmit={handleClick}>
                    <h1>Signup</h1>
                    <div className='form-group-row'>
                        <div className='formgroup'>
                            <label htmlFor='fname'>First Name</label>
                            <input type='text' id='fname' />
                        </div>
                        <div className='formgroup'>
                            <label htmlFor='lname'>Last Name</label>
                            <input type='text' id='lname' />
                        </div>
                    </div>
                    <div className='formgroup'>
                        <label htmlFor='email'>Email</label>
                        <input type='email' id='email' />
                    </div>

                    <div className='form-group-row'>
                        <div className='formgroup'>
                            <label htmlFor='password'>Password</label>
                            <input type='password' id='password' />
                        </div>
                        <div className='formgroup'>
                        <label htmlFor='cpassword'>Confirm Password</label>
                        <input type='password' id='cpassword' />
                    </div>
                    </div>

                    <Link to='/login'
                        className='stylenone'
                    >
                        <p>Already have an account?</p>
                    </Link>
                    <Link to='/signup'
                        className='stylenone'
                    >
                        <button onClick={handleClick} className='btn'>Signup</button>
                    </Link>
                </form>
            </div>
        </div>
    )
}