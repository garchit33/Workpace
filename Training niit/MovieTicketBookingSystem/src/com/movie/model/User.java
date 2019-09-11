package com.movie.model;

public class User {
	
	
	private String User_fname;
	private String User_lname;
	private int User_Pno;
	private String email;
	private String pswrd;
	
	public User(int User_Id, String User_fname,String User_lname, int User_Pno, String email, String pswrd) {
		
		
		this.User_fname=User_fname;
		this.User_lname=User_lname;
		this.User_Pno=User_Pno;
		this.email=email;
		this.pswrd=pswrd;
	}
	
	
	public String getUser_fname() {
		return User_fname;
	}
	public void setUser_fname(String User_fname) {
		this.User_fname = User_fname;
	}
	public String getUser_lname() {
		return User_lname;
	}
	public void setUser_lname(String User_lname) {
		this.User_lname = User_lname;
	}
	public int getUser_Pno() {
		return User_Pno;
	}
	public void setUser_Pno(int User_Pno) {
		this.User_Pno = User_Pno;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getpswrd() {
		return pswrd;
	}
	public void setpswrd(String pswrd) {
		this.pswrd = pswrd;
	}
	
	public String toString(){
		
		return "MovieUser[fname="+User_fname+", lname="+User_lname+", email="+email+", Phone="+User_Pno+", upass="+pswrd+ "]";
	}

}

//	@Override
//	public boolean equals(Object o) {
//		
//		if(this==o)
//			return true;
//		if(o==null || getClass()!=o.getClass())
//			return false;
//		MovieUser mu = (MovieUser) o;
//		return User_Id == mu.User_Id;
//	}
//		
//	@Override
//	public int hashCode() {
//		
//		return Objects.hash(User_Id);
//		
//	}
	
	
