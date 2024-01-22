import React from 'react'
import './HomeCategories.css'
import img1 from '../../ASSETS/Images/img1.png'
import img2 from '../../ASSETS/Images/img2.png'
import img3 from '../../ASSETS/Images/img3.png'
import img4 from '../../ASSETS/Images/img4.png'
import axios from "axios"
import { useState } from "react"
import { useEffect } from "react"

export const HomeCategories = () => {
   

    return (
        <div className='homecategories'>
            <div className='container'>
            <img src={img1} alt='img1' />
            <div className='content'>
                <h1>
                New Cleaning Products
                </h1>
                <p> Shop toiletries now</p>
            </div>
            </div>
            <div className='container'>
            <img src={img2} alt='img2' />
            <div className='content'>
                <h1>
                Dairy at your doorstep
                </h1>
                <p> Shop dairy now</p>
            </div>
            </div>
            <div className='container'>
            <img src={img3} alt='img3' />
            <div className='content'>
                <h1>
                Vegetables at your doorstep
                </h1>
                <p> Shop vegetables now</p>
            </div>
            </div>
            <div className='container'>
            <img src={img4} alt='img4' />
                <div className='content'>
                <h1>
                Meat at your doorstep
                </h1>
                <a> Shop meat now</a>
            </div>
            </div>
        </div>
    )
}
