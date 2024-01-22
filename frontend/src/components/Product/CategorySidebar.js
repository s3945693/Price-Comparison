import React from 'react'
import fruits from '../../ASSETS/Categories/fruits.png'
import vegetables from '../../ASSETS/Categories/vegetables.png'
import meat from '../../ASSETS/Categories/meat.png'
import dairy from '../../ASSETS/Categories/dairy.png'
import drinks from '../../ASSETS/Categories/drinks.png'
import snacks from '../../ASSETS/Categories/snacks.png'
import bakery from '../../ASSETS/Categories/bakery.png'
import household from '../../ASSETS/Categories/household.png'
import seafood from '../../ASSETS/Categories/seafood.png'
import pet from '../../ASSETS/Categories/pet.png'
import './CategorySidebar.css'
import axios from "axios"
import { useState } from "react"
import { useEffect } from "react"

export const CategorySidebar = () => {
    const data = [
        {
            id: 0,
            categoryimage: fruits,
            link: '/categories/fruits',
        },
        {
            id: 1,
            categoryimage: vegetables,
            link: '/categories/vegetables',
        },
        {
            id: 2,
            categoryimage: meat,
            link: '/categories/meat',
        },
        {
            id: 3,
            categoryimage: dairy,
            link: '/categories/dairy',
        },
        {
            id: 4,
            categoryimage: drinks,
            link: '/categories/drinks',
        },
        {
            id: 5,
            categoryimage: snacks,
            link: '/categories/snacks',
        },
        {
            id: 6,
            categoryimage: bakery,
            link: '/categories/bakery',
        },
        {
            id: 7,
            categoryimage: household,
            link: '/categories/household',
        },
        {
            id: 8,
            categoryimage: seafood,
            link: '/categories/seafood',
        },
        {
            id: 9,
            categoryimage: pet,
            link: '/categories/pet',
        }
    ]

    const [categoryArray, setCategoryArray] = useState(null);
    
    
    useEffect(() => {
        //get request to backend for list of users
        axios.get('http://localhost:8080/prds/categories')?.then(response => {
            setCategoryArray(response?.data);
        });
        
        //empty [] means it will only run once on page load, fill with variables to run when they change
    }, []);

    
    
    return (
        <div className='categorysidebar'>
            {
                data.map((item) => {
                    return (
                        <div className='category'>
                            <img src={item.categoryimage} alt='categoryimage' />
                            <h3><a href={item.link}>{categoryArray && categoryArray.length > 0 ? categoryArray[item.id].name : ''}</a></h3>
                        </div>
                    )
                })
            }
        </div>
    )
}
