import React,{useState,useEffect} from 'react'
import {useNavigate,useLocation} from 'react-router-dom'
import ProductService from '../service/ProductService';
export default function ProductEdit() {
    const [formdetails,setformdetails]=useState({pid:"",pname:"",qty:"",price:"",ldtstr:"",cid:""});
    const navigate=useNavigate();
    const location=useLocation();
    useEffect(()=>{
        setformdetails({...location.state.proddata})
    },[])
    const hadlechange=(event)=>{
       //let name=event.target.name;
       //let value=event.target.value;
       let {name,value}=event.target;
       setformdetails({...formdetails,[name]:value})
    }
  const updateproduct=()=>{
    if(formdetails.pid==="" || formdetails.pname==="" || formdetails.qty==="" || formdetails.price==="" || formdetails.ldtstr==="" || formdetails.cid===""){
        alert("pls fill all the fields");

    }else{
        ProductService.updateProduct(formdetails)
        .then((response)=>{
            console.log(response);
            navigate("/table")

        })
        .catch((err)=>{
            console.log(err);
        })
    }
  }
  return (
    <div>
        <form>
            <div className="form-group">
                <label for="pid">Product pid</label>
                <input type="text" className="form-control" id="pid" name="pid" 
                value={formdetails.pid}
                onChange={hadlechange} readOnly/>             
            </div>

            <div className="form-group">
                <label for="pname">Product Name</label>
                <input type="text" className="form-control" id="pname" name="pname" 
                value={formdetails.pname}
                onChange={hadlechange}/>             
            </div>

            <div className="form-group">
                <label for="qty">Product Qty</label>
                <input type="text" className="form-control" id="qty" name="qty"
                value={formdetails.qty}
                onChange={hadlechange} />             
            </div>

            <div className="form-group">
                <label for="price">Product price</label>
                <input type="text" className="form-control" id="price" name="price" 
                value={formdetails.price}
                onChange={hadlechange}/>             
            </div>

            <div className="form-group">
                <label for="mfgdate">Mfgdate</label>
                <input type="text" className="form-control" id="ldtstr" name="ldtstr" value={formdetails.ldtstr}
                onChange={hadlechange} readOnly/>             
            </div>

            <div className="form-group">
                <label for="cid">Product cid</label>
                <input type="text" className="form-control" id="cid" name="cid"
                value={formdetails.cid}
                onChange={hadlechange} />             
            </div>

            <button type="button" name="add" id="add" className="btn btn-success" onClick={updateproduct}>Update Product</button>
            </form>
    </div>
  )
}
