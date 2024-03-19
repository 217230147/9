public class Performance {  
        private String performanceID;  
        private String performanceName;  
        private String performanceLeadName;
        private char performanceGroup;  
      
        public Performance(String performanceID, String performanceName, String performanceLeadName,char performanceGroup) {  
            this.performanceID = performanceID;  
            this.performanceName = performanceName;  
            this.performanceLeadName = performanceLeadName;
            this.performanceGroup=performanceGroup;  
        }  
      
        public String getPerformanceID() {  
            return performanceID;  
        }  
      
        public void setPerformanceID(String performanceID) {  
            this.performanceID = performanceID;  
        }  
      
        public String getPerformanceName() {  
            return performanceName;  
        }  
      
        public void setPerformanceName(String performanceName) {  
            this.performanceName = performanceName;  
        }  
      
        public String getPerformanceLeadName() {  
            return performanceLeadName;  
        }  
      
        public void setPerformanceLeadName(String performanceLeadName) {  
            this.performanceLeadName = performanceLeadName;  
        }
        public char getPerformanceGroup() {  
            return performanceGroup;  
        }  
      
        public void setPerformanceGroup(String performanceGroup) {  
            this.performanceLeadName = performanceGroup;  
        }    
      
        @Override  
        public String toString() {  
            return "Performance ID: " + performanceID + ", Name: " + performanceName + ", Lead Name: " + performanceLeadName;  
        }  
}  

