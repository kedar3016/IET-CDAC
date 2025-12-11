import React,{useState,useEffect} from 'react'
import { useParams } from 'react-router-dom'
import ProductService from '../service/ProductService';
export default function ProductDetails() {
    const param=useParams();
    const [myprod,setmyprod]=useState({});
    useEffect(()=>{
        const pid=param.pid;
        ProductService.getById(pid)
        .then((response)=>{
            setmyprod({...response.data})
        })
        .catch(()=>{})
    },[param.pid])
  return (
    <div>
       <div className="card" style={{"width": "18rem"}}>
  <div className="card-body">
    <h5 className="card-title">Name : {myprod.pname}</h5>
    <h6 className="card-subtitle mb-2 text-muted">Price: {myprod.price}</h6>
    <p className="card-text">Qty: {myprod.qty}</p>
   <p className="card-text">mfgdate: {myprod.ldtstr}</p>
   <p className="card-text">cid: {myprod.cid}</p>
  </div>
</div>

    </div>
  )
}
