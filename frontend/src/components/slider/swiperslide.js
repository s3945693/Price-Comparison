import { Swiper, SwiperSlide } from "swiper/react";
import { Autoplay, Navigation } from "swiper/modules";
import { MdDoubleArrow } from "react-icons/md";
import { useState, useEffect } from "react";
import axios from 'axios';


export const SwiperSlideComponent = (props) => {
    let temp = props.id;
    const [product, setProduct] = useState({});
    const [price, setPrice] = useState(null);

    const getProducts = async () => {
        try {
            const response = await axios.get('http://localhost:8080/prds/product/' + temp);
            setProduct(response.data?.product);
            // Assuming you want to display the price of the first item
            setPrice(response.data?.items[1]?.price);
        } catch (error) {
            console.error(error);
        }
    }

    useEffect(() => {
        getProducts();
    }, [temp]);



    return (
        <SwiperSlide>
            <div className='hoverIncrease'>
                <img src={product.image_url} alt="" />
                <div className='content'>
                    <h1><a href="/product">{product?.name}</a></h1>
                    <h2>${price}</h2>
                    <div className='price-underline'></div>
                    <div className='select-btn'>
                        <p>SELECT OPTION</p>
                        <MdDoubleArrow className='ml-1' />
                    </div>
                </div>
            </div>
        </SwiperSlide>
    )
}
