import { Container, Navbar,Nav} from 'react-bootstrap'
import React, { useEffect } from 'react';
import { BiSearchAlt} from 'react-icons/bi';
import { BsListCheck, BsFillCartFill } from 'react-icons/bs';
import { RiAccountBoxLine } from 'react-icons/ri';
import './header.css';
import { useState } from 'react';

//https://react-bootstrap.netlify.app/docs/getting-started/introduction/

export const Header = () =>{

    const loginPrompt = () => {
        if (userId === null || userId === undefined || userId === "" || userId === "null"|| userId === "undefined"){
            return (
                <Nav className = 'account'>
                    <RiAccountBoxLine href='/login'className='icon'/>
                    <Nav.Link href = "/login"> Log in or Sign Up </Nav.Link>
                </Nav>
            )
        }
        else{
            
            return (
                <Nav className = 'account'>
                    <Nav.Link href = "/accountpage"> {sessionStorage.getItem("userName")} </Nav.Link>
                </Nav>
            )
        }

    }

    const [userId, setUserId] = useState(null);

    useEffect(() => {
        console.log("Changed user: ", userId)
        sessionStorage?.getItem('userId') && setUserId(sessionStorage.getItem('userId'));
    }, [userId])
    
    return (
        <Navbar className = 'header'>
            <Container>
                <Navbar.Brand href="/" className='header-brand'>
                    <b> SuperPrice </b>
                </Navbar.Brand>
            </Container>
            <Container>
                <div className = 'search-bar'>
                    <BiSearchAlt className='icon'/>
                    <input type="text" placeholder='   |  Search for items...'/>
                    <button type="submit"><i class="fa fa-search"></i></button>
                </div>
            </Container>
            <Container>
                <Nav className = 'list'>
                    <BsListCheck href='/list'className='icon'/>
                    <Nav.Link href = "/list"> List </Nav.Link>
                </Nav>
                {loginPrompt()}
                <Nav className = 'cart'>
                    <BsFillCartFill href='/cart'className='icon'/>   
                    <Nav.Link href = "/cart"> My Cart </Nav.Link>
                </Nav>
            </Container>
      </Navbar>
    )
}