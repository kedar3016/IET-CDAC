import React,{useState,useEffect} from 'react'
import ProductService from '../service/ProductService';
import {Link,Outlet} from 'react-router-dom';
export default function ProductTable() {
    const [prodarr,setprodarr]=useState([]);
    const [searcharr,setsearcharr]=useState([]);
    const [searchtxt,setsearchtxt]=useState("");
    //initialization useEffect
    useEffect(()=>{
        fetchdata()
    },[])

     useEffect(()=>{
        setsearcharr([...prodarr])
    },[prodarr])
    useEffect(()=>{
        if(searchtxt===""){
            setsearcharr([...prodarr])
        }else{
            let arr=prodarr.filter(prod=>prod.pname.includes(searchtxt))
            setsearcharr([...arr])
        }
    },[searchtxt])
    const fetchdata=async ()=>{
       let response=await ProductService.getAllProducts();
        console.log(response);
        setprodarr([...response.data])
        
        
    }
    const handlechange=(event)=>{
        setsearchtxt(event.target.value)
    }

    const deleteProduct=(pid)=>{
        ProductService.deleteProduct(pid)
        .then((response)=>{
            console.log(response)
            fetchdata();
        })
        .catch((err)=>{
            console.log(err)
        });
    }
  return (
    <div>
        <Link to="/form">
      <button type="button" name="Edit" id="Edit"
        className="btn btn-success">Add new Product</button>
        </Link>
        <br/><br/>

        Search : <input type="text" name="searchtxt" id="searchtxt"
         
        value={searchtxt}
        onChange={handlechange}></input>
<br/>
      <table className="table table-striped">
  <thead>
    <tr>
      <th scope="col">Product Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Product Qty</th>
      <th scope="col">price</th>
      <th scope="col">mfgdate</th>
      <th scope="col">cid</th>
      <th scope="col">action</th>
    </tr>
  </thead>
  <tbody>
    {searcharr.map(prod=><tr key={prod.pid}>
      <th scope="row">{prod.pid}</th>
      <td>{prod.pname}</td>
      <td>{prod.qty}</td>
      <td>{prod.price}</td>
      <td>{prod.mfgdate}</td>
      <td>{prod.cid}</td>
      <td>
<Link to={`/table/details/${prod.pid}`}>
        <button type="button" name="view" id="view" className="btn btn-primary">View</button></Link>&nbsp;&nbsp;&nbsp;&nbsp;

        <button type="button" name="delete" id="delete" className="btn btn-danger" onClick={()=>{deleteProduct(prod.pid)}}>delete</button>&nbsp;&nbsp;&nbsp;&nbsp;

<Link to={`/edit/${prod.pid}`} state={{proddata:prod}}>
        <button type="button" name="Edit" id="Edit"
        className="btn btn-warning">Edit</button></Link>&nbsp;&nbsp;&nbsp;&nbsp;
      </td>
    </tr>)}
  </tbody>
</table>
<div>
    <Outlet></Outlet>
</div>
    </div>
  )
}