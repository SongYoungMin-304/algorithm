package javaStudy;

public class ifcase {

    public String ifcase(String branch){
        if("a".equals(branch)){
            return "abranch";
        }else if("b".equals(branch)){
            return "bbranch";
        }
        return "cbranch";
    }

    /* if else 안에 비즈니스 로직을 넣지 말고 비즈니스 로직은
    *  인터페이스 상속 받은 구현체 안에 넣자  */
    public String interfacecase(String branch){
        ProcessBranchFactory pbf = new ProcessBranchFactory();
        ProcessBranch pb = pbf.getProcessBatch(branch);
        return pb.process();
    }

    public static void main(String[] args) {
        String result = "";

        ifcase a = new ifcase();
        result = a.interfacecase("a");
        System.out.println(result);
    }
}
