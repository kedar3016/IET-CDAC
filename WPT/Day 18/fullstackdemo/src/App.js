import logo from './logo.svg';
import './App.css';
import "bootstrap/dist/css/bootstrap.css"
import MainNavBar from './component/MainNavBar';
import MyHeader from './component/MyHeader';
import MyFooter from './component/MyFooter';
import { Routes,Route ,Navigate} from 'react-router-dom';
import ProductDetails from './pages/ProductDetails';
import ProductForm from './pages/ProductForm';
import ProductTable from './pages/ProductTable';
import ProductEdit from './pages/ProductEdit';
import AboutUs from "./pages/AboutUs";
import HomeComponent from './pages/HomeComponent';

function App() {
  return (
    <div>
      <MyHeader/>
      <MainNavBar></MainNavBar>
      <Routes>
         <Route path="/" element={<Navigate replace to="/home"></Navigate>}></Route>

         <Route path="/home" element={<HomeComponent></HomeComponent>}></Route>
         <Route path="/table" element={<ProductTable></ProductTable>}>
             <Route path="details/:pid" element={<ProductDetails></ProductDetails>}></Route>
         
         </Route>
         <Route path="/edit/:pid" element={<ProductEdit></ProductEdit>}></Route>

         <Route path="/form" element={<ProductForm></ProductForm>}></Route>

         <Route path="/aboutus" element={<AboutUs></AboutUs>}></Route>
      </Routes>
      <MyFooter/>
    </div>
  );
}

export default App;
