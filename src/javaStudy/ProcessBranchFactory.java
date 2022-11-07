package javaStudy;

public class ProcessBranchFactory {

    private Abranch abranch = new Abranch();
    private Bbranch bbranch = new Bbranch();

    public ProcessBranch getProcessBatch(String branch){

        ProcessBranch processBranch = null;
        if("a".equals(branch)){
            processBranch = abranch;
        }
        else if("b".equals(branch)){
            processBranch = bbranch;
        }

        return processBranch;
    }
}
