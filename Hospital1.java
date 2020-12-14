import java.util.*;
class staff
{
    String sid,sname,ssex,ssalary,sdesig;
    void new_staff()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("ID:");
        sid=input.nextLine();
        System.out.print("Name:");
        sname=input.nextLine();
        System.out.print("Gender:");
        ssex=input.nextLine();
        System.out.print("Salary:");
        ssalary=input.nextLine();
        System.out.print("Designation:");
        sdesig=input.nextLine();
    }
    void staff_info()
    {
        System.out.println(sid+" "+sname+"  "+ssex+"  "+ssalary+"  "+sdesig);
    }
}
class medicine
{
    String mname,expdate;
    int cost,count;
    void new_medicine()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Name:");
        mname=input.nextLine();
        System.out.print("Expire date:");
        expdate=input.nextLine();
        System.out.print("Cost:");
        cost=input.nextInt();
        System.out.print("Count:");
        count=input.nextInt();
    }
    void medicine_info()
    {
        System.out.println(mname+"  "+expdate+"       "+cost+" "+count);
    }
}
class patient
{
    String pid,pname,psex,disease,admit_status;
    int age;
    void new_patient()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("ID:-");
        pid=input.nextLine();
        System.out.print("Name:-");
        pname=input.nextLine();
        System.out.print("Gender:-");
        psex=input.nextLine();
        System.out.print("Disease:-");
        disease=input.nextLine();
        System.out.print("Admit status:-");
        admit_status=input.nextLine();
        System.out.print("Age:-");
        age=input.nextInt();
        
    }
    void patient_info()
    {
        System.out.println(pid+" "+pname+"  "+psex+"  "+disease+"     "+admit_status+"     "+age);
    }
}
class doctor
{
    String dname,dspl,drno,davail;
    int did;
    void new_doctor()
    {
        Scanner input1=new Scanner(System.in);
        System.out.print("ID:-");
        did=input1.nextInt();
        Scanner input=new Scanner(System.in);
        System.out.print("Name:-");
        dname=input.nextLine();
        System.out.print("Specilasation:-");
        dspl=input.nextLine();
        System.out.print("Room NO:-");
        drno=input.nextLine();
        System.out.print("Availability:-");
        davail=input.nextLine();
    }
    void doc_info()
    {
        System.out.println(did+" "+dname+"   "+dspl+"         "+drno+"      "+davail);
    }
}
class Hospital1
{
    public static void main(String[] args)
    {
        int i,s=1,ch,co1=0,co2=0,co3=0,co4=0;
        doctor[] d=new doctor[25];
        patient[] p=new patient[25];
        medicine[] m=new medicine[25];
        staff[] st=new staff[25];
        for(i=0; i<25; i++)
        {
            d[i]=new doctor();
            p[i]=new patient();
            m[i]=new medicine();
            st[i]=new staff();
        }
        while(s==1)
        {
            System.out.println("                            MAIN MENU");
            System.out.println("__________________________________________________________________________");
            System.out.println("1. Doctor  2. Patient 3. Medicine 4. Staff");
            System.out.println("__________________________________________________________________________");
            Scanner input=new Scanner(System.in);
            ch=input.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("---------------DOCTOR SECTION----------------");
                    int s1=1;
                    while(s1==1)
                    {
                        System.out.println("1. Add Doctor");
                        System.out.println("2. Existing Doctors");
                        int c1;
                        c1=input.nextInt();
                            switch(c1)
                            {
                                    case 1:
                                        d[co1].new_doctor();
                                        co1++;
                                        break;
                                    case 2:
                                        if(co1==0)
                                        {System.out.println("There is no doctor details"); break;}
                                         System.out.println("ID "+"Name  "+"Specilasation "+"Room No "+"Availability");
                                        for(i=0; i<co1; i++)
                                        {
                                            d[i].doc_info();
                                        }
                                        break;
                            }
                        System.out.println("1 for continue 0 for main menu");
                        s1=input.nextInt();
                    }
                    break;
                }
                case 2:
                    {
                        System.out.println("---------------PATIENT SECTION----------------");
                        
                        int s2=1;
                        while(s2==1)
                        {
                            System.out.println("1. New Patient");
                            System.out.println("2. Existing Patient");
                            int c2;
                            c2=input.nextInt();
                            switch(c2)
                            {
                                case 1:
                                    p[co2++].new_patient();
                                    break;
                                case 2:
                                    {
                                        if(co2==0)
                                        {
                                            System.out.println("There is no patient record");
                                            break;
                                        }
                                        System.out.println("ID Name  Gender  Disease  Admit_status  Age");
                                        for(i=0; i<co2; i++)
                                        {
                                            p[i].patient_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("1 for continue 0 for 0 for main menu");
                            s2=input.nextInt();
                        }
                        break;
                    }
                case 3:
                        {
                        System.out.println("--------------------------MEDICINE--------------------");
                        int s3=1;
                        while(s3==1)
                        {
                            System.out.println("1. Add Medicine\n 2. Existing Medicine");
                            int c3;
                            c3=input.nextInt();
                            switch(c3)
                            {
                                case 1:
                                    m[co3++].new_medicine();
                                    break;
                                case 2:
                                    {
                                        if(co3==0)
                                        {
                                            System.out.println("There is no Medicine record");
                                            break;
                                        }
                                        System.out.println("Name\t Expire date\t cost\t count\t");
                                        for(i=0; i<co3; i++)
                                        {
                                            m[i].medicine_info();
                                        }
                                        break;
                                    }
                            }
                                    System.out.println("1 for continue 0 for mainmenu");
                                    s3=input.nextInt();
                        }
                        break;
                    }
                case 4:
                    {
                        System.out.println("------------------------------STAFF------------------------");
                        int s4=1;
                        String a="Nurse",b="Wardboy";
                        while(s4==1)
                        {
                            System.out.println("1. New staff\n2. Existing Nurse\n3. Existing Wardboy");
                            int c4;
                            c4=input.nextInt();
                            switch(c4)
                            {
                                case 1:
                                    st[co4++].new_staff();
                                    break;
                                case 2:
                                    if(co4==0)
                                    {
                                        System.out.println("There is no record");
                                        break;
                                    }
                                    System.out.println("ID  Name   Gender   Salary   Designation");
                                    for(i=0; i<co4; i++)
                                    {
                                        if(a.equals(st[i].sdesig)) st[i].staff_info();
                                    }
                                    break;
                                case 3:
                                    if(co4==0)
                                    {
                                        System.out.println("There is no record");
                                        break;
                                    }
                                    System.out.println("ID  Name  Gender  Salary Designation");
                                    for(i=0; i<co4; i++)
                                    {
                                        if(b.equals(st[i].sdesig)) st[i].staff_info();
                                    }
                                    break;
                            }
                            System.out.println("1 for continue 0 for mainmenu");
                            s4=input.nextInt();
                        }
                    }
                    
            }
            System.out.println("Enter 1 for continue or 0 for end the program");
            s=input.nextInt();
            
        }
    }
}