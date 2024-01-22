import { Banner } from '../../components/banner/banner'
import { HomeCategories } from '../../components/Categories/HomeCategories'
import { ProductSidebar } from '../../components/Product/ProductSidebar'
import { FeatureProducts } from '../../components/Product/FeatureProducts'
import "./home.css";



export const Home = () => {
    

    return(
        <div className="App">
          <div>
          <Banner 
          heading="Order Now, Pick Up Later"
          bannerimage= 'https://images.unsplash.com/photo-1506617564039-2f3b650b7010?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80'
          />
          <HomeCategories />

          <ProductSidebar />
          <FeatureProducts />
{/*           
          <Container><ProductSidebar /></Container>
          <Container><FeatureProducts /></Container>
           */}

          </div>

        </div>
    )
}
