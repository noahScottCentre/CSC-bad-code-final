			        package testPrep1; public class Employee 
                             {public String f,  l, t; public float r, h, p; 
			   public Employee(String f, String l, float r, String 
		          t) {this.f = f; this.l = l; this.r = r; this.h = 0.0f; 
			 this.t = t;} public void setFirstName(String f) { this.f
                        = f;}          public void          setLastName(String l){
		       this.l          = l;}public          void setRate(float r) { 
		       this.r          = r;}public          void setHours(float h){ 
		       this.h          = h;}public          void setLastPayment(float
		       p){ this.p = p;} public String getFirstName() {     return f; } 
			public String getLastName () { return l; }        public float
		         getRate()                                      { return r; }           
                          public float                             getHours(){return 
		            h; } public float getLastPayment(){ return p; } public
                              float pay() { p = r * h; return p; } public String 
                                toString() { return this.t + ": " + this.f + " " 
                                   + this.l + " Last Payment: " + this.p;}}
