import React from 'react';
import { GiHamburgerMenu } from 'react-icons/gi';
import './navbar.css';


//https://react-bootstrap.netlify.app/docs/getting-started/introduction/

export const Navbars = () =>{
    
    return (
        <div className='navbar-container'>
            <div className='navbar-sub-container'>
                <div className='burger-menu'>
                    <GiHamburgerMenu className='burger-menu-icon'/>
                    <p>Browse Products</p>
                </div>
                
                <div className='navbar'>
                    <ul className='anim-nav'>
                        <li><a href="#!">Bought Before</a></li>
                        <li><a href="#!">Recipes & Ideas</a></li>
                        <li><a href="#!">Catalogue</a></li>
                        <li><a href="#!">Specials</a></li>
                        <li><a href="/FAQ">FAQ</a></li>
                    </ul>
                </div>
            </div>
        </div>
        
    )
}