package Assigns;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;



public class CustomerFileDB {
	String file="data\\customer.dat";
	
	public int saveCustomer(Customer customer) {
		int status=-1;
		FileWriter filewriter=null;
		BufferedWriter bufferedWriter=null;
		try {
			fileWriter=new FileWriter(file,true);
			bufferedWriter=new BufferedWriter(fileWriter);
			String data=customer.getCustomerId()+":"+customer.getCustomerName()+"\n";
			bufferedWriter.write(data);
			bufferedWriter.flush();
			status=0;
		}catch(IOException e) {
			status=-2;
			e.printStackTrace();
		}finally {
			if(null!=bufferedWriter) {
				try {
					bufferedWriter.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(null!=fileWriter) {
				try {
					fileWriter.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		return status;
	}
	public Customer getCustomer(int CustomerId) {
		Customer customer=null;
		FileReader fileReader=null;
		BufferdReader bufferedReader=null;
		try {
			fileReader=new FileReader(file);
		bufferedReader=new BufferedReader(fileReader);
		String[]data=null;
		
		String input=bufferedReader.readLine();
		while(input!=null) {
			data=input.split(":");
			if(Integer.parseInt(data[0])==customerId){
				customer=new Customer();
				customer.setCustomerId (Integer.parseInt(data[0]));
				customer.setCustomerName (data[1]); break;
			}
			   input=bufferedReader.readLine();
		}
				//reading the data from the file input=bufferedReader.readLine();
				} catch (IOException ioException) {
				ioException.printStackTrace(); } finally
				* closing the readers
				if (null!=bufferedReader) { try {
				bufferedReader.close(); } catch (IOException ioException) {
				ioException.printStackTrace();
				if (null!=fileReader) 
				{
					try {
				fileReader.close(); 
				} catch (IOException ioException) {
				ioException.printStackTrace();
				}
				}
				}
				//returning the customer bean 
				return customer;


			}
		}
	
	

