import React, {  useState, useEffect } from 'react'
import { Navbar } from 'react-bootstrap'
import { Link  } from 'react-router-dom'
import axios from 'axios';
import './AuthPage.css'

export const LoginPage = () => {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [user, setUser] = useState();
    
    const handleClick = async () => {
        
        try {
            const response = await axios.get('http://localhost:8080/usr/login/username', {
                params: {
                    username: email,
                    password: password
                }
            });
            //console.log(response.data);
            //console.log("should set user on next line")
            setUser(response.data);
            
            sessionStorage.setItem('userId', response.data?.id);
            sessionStorage.setItem('userName', response.data?.firstname);
    
        } catch (error) {
            console.error(error);
        }
        
        
    };
    useEffect(() => {

        console.log("Changed user: ", user)

        !user && console.log("User not logged in");
        user && console.log("User logged in");
        
        

        user && window.location.replace("http://localhost:3000");

    }, [user])


    

    return (
        <div className='authpage'>
            <Navbar />

            <div className='authcont'>
                <img src='https://images.unsplash.com/photo-1495480137269-ff29bd0a695c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1172&q=80'
                alt='login'/>

                <form className='authform' onSubmit={handleClick}>
                    <h1>Login</h1>
                    <div className='formgroup'>
                        <label htmlFor='email'>Email</label>
                        <input type='email' id='email' value={email} onChange={e => setEmail(e.target.value)}/>
                    </div>

                    <div className='formgroup'>
                        <label htmlFor='password'>Password</label>
                        <input type='password' id='password' value={password} onChange={e => setPassword(e.target.value)}/>
                    </div>

                    <Link to='/forgotpassword'
                        className='stylenone'
                    >
                        <p>Forgot Password?</p>
                    </Link>
                    <button onClick={handleClick} className='btn'>Login</button>
                    <h2 className='or'>OR</h2>
                    <Link to='/signup'
                        className='stylenone'
                    >
                        <button className='btn'>Signup</button>
                    </Link>
                </form>
            </div>
        </div>
    )
}
