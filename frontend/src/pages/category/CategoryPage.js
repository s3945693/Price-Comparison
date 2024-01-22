import { Banner } from '../../components/banner/banner'
import { HomeCategories } from '../../components/Categories/HomeCategories'
import { useEffect } from "react"
import axios from "axios"
import { useState } from "react"
import Container from 'react-bootstrap/Container';
import { ProductSidebar } from '../../components/Product/ProductSidebar'
import { FeatureProducts } from '../../components/Product/FeatureProducts'
import "./CategoryPage.css";



export const CategoryPage = () => {
    const [users, setUsers] = useState(null);
    

    return(
        <div className="App">
          <div>
          <FeatureProducts />


          </div>

        </div>
    )
}
