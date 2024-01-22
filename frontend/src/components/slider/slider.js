import React,{  useState, useEffect }from "react";
import { Swiper, SwiperSlide } from "swiper/react";
import img1 from '../../ASSETS/Images/img1.png';
import img2 from '../../ASSETS/Images/img2.png';
import img3 from '../../ASSETS/Images/img3.png';
import img4 from '../../ASSETS/Images/img4.png';
import "./slider.css";
import "swiper/css/pagination";
import "swiper/css/navigation";
import "swiper/css";
import "swiper/css/pagination";
import { Autoplay, Navigation } from "swiper/modules";
import { MdDoubleArrow } from "react-icons/md";
import axios from 'axios';
import { SwiperSlideComponent } from "./swiperslide";


const Slider = () => {

    return (
        <Swiper
            slidesPerView={4}
            spaceBetween={0}
            autoplay={{
                delay: 2500,
                disableOnInteraction: false,
                pauseOnMouseEnter: true,

            }}
            navigation={true}
            modules={[Autoplay, Navigation]}
            className="mySwiper"
        >
            <SwiperSlideComponent id={1} />
            <SwiperSlideComponent id={2} />
            <SwiperSlideComponent id={3} />
            <SwiperSlideComponent id={4} />
            <SwiperSlideComponent id={5} />
            <SwiperSlideComponent id={6} />
            <SwiperSlideComponent id={7} />
            <SwiperSlideComponent id={8} />

        </Swiper>
    );
}

export default Slider;