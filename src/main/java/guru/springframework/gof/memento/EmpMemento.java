package guru.springframework.gof.memento;

public class EmpMemento {
    private int empId;
    private String empName;
    private String empPhoneNo;
    private String empDesignation;
    public EmpMemento(int empId,String empName,String empPhoneNo,String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empPhoneNo = empPhoneNo;
        this.empDesignation = empDesignation;
    }
   public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public String getEmpPhoneNo() {
        return empPhoneNo;
    }

    @Override
    public String toString(){
        String str="Current Memento State" + this.empId +" , "+this.empName +" , "+this.getEmpPhoneNo()+" , "+this.getEmpDesignation();
        return str;
    }
    }

