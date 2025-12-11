import axios from 'axios';
const baseUrl="http://localhost:8181/"
//const token="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbjEiLCJyb2xlIjoiUm9sZV9BRE1JTiIsImlhdCI6MTc2NTM0NTkxMiwiZXhwIjoxNzY1NDMyMzEyfQ.Zp2emzzycuPHGYD-T3Vnf2dKoOGvVNae7UXJETbzFbo";

class ProductService{
  getAllProducts(){
     //let myheader={'Authorization':'Bearer '+token}
    return axios.get(baseUrl+"products");//,{headers:myheader})
    
  }
  getById(pid){
     return axios.get(baseUrl+"products/"+pid)
  }
  addProduct(product){
    let myheader={'content-type':'application/json'}
    return axios.post(baseUrl+"products/"+product.pid,product,{headers:myheader})
  }
  
  updateProduct(product){
    let myheader={'content-type':'application/json'}
    return axios.put(baseUrl+"products/"+product.pid,product,{headers:myheader})
  }

  deleteProduct(pid){
    return axios.delete(baseUrl+"products/"+pid);//,{headers:myheader})
  }

}

export default new ProductService();