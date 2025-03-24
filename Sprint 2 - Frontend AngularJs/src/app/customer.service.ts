import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  API="http://localhost:8080";
  public registerCustomer(customerData: any)
  {
    return this.http.post(`${this.API}/customerservice` , customerData);
  }

  public getCustomers(){
    return this.http.get(`${this.API}/customerservice`);
  }

  public deleteCustomer(customerId:any){
    return this.http.delete(`${this.API}/customerservice/${customerId}`);
  }

  public updateCustomer(customer: any){
    return this.http.put(`${this.API}/customerservice/${customer.cid}`, customer);
  }
  constructor(private http: HttpClient) { }
}
