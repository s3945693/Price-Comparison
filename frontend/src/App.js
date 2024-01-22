import './App.css';
import './App.scss';
import 'bootstrap/dist/css/bootstrap.min.css';
import './custom.scss';
import { Footer } from './components/Footer/footer';
import { Navbars } from './components/navbar/navbar';
import { Header } from './components/header/header';
import { Home } from './pages/homepage/home';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import { LoginPage } from './pages/AuthUser/Login';
import { SignupPage } from './pages/AuthUser/Signup';
import { ForgotPasswordPage } from './pages/AuthUser/ForgotPassword';
import { CategoryPage } from './pages/category/CategoryPage';
import { ProductPage } from './pages/product/ProductPage';
import { FAQ } from './pages/extra/FAQ';

// https://react-bootstrap.netlify.app/docs/getting-started/introduction/
//TODO: make separate components for each page, and use react router to navigate between them
//      setup testing for frontend

function App() {
  //array of users
  return(
    <div className="App">
      
      <Router>
      <header><Header/></header>
      <header><Navbars/></header>
        <main>
          <Routes>
            <Route path="/" element={<Home />}> </Route>
            <Route path="/login" element={<LoginPage />}> </Route>
            <Route path="/signup" element={<SignupPage />}> </Route>
            <Route path="/forgotpassword" element={<ForgotPasswordPage />}> </Route>
            <Route path="/categories/fruits" element={<CategoryPage />}> </Route>
            <Route path="/categories/vegetables" element={<CategoryPage />}> </Route>
            <Route path="/product" element={<ProductPage />}> </Route>
            <Route path="/FAQ" element={<FAQ />}> </Route>
          </Routes>
        </main>
      </Router>
      <Footer/>
    </div>
  )
}

export default App;
