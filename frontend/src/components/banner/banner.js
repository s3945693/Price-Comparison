import React from 'react'
import './banner.css'

export const Banner = ({bannerimage, heading}) => {
  return (
    <div className='singlebanner'>
        <div className='bannerimgfilter'></div>
        <img className='bannerimg' src={bannerimage} alt='noimg' />
        <div className='bannerheading'>
            <h1>{heading}</h1>
        </div>
    </div>
  )
}