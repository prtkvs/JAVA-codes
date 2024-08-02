import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class jobSequencing {
    static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int[][] jobsInfo = {{4,20},{1,10},{1,40},{1,30}};
        //Job[] jobs = new Job[jobsInfo.length]; -> Array of Job
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        Collections.sort(jobs,(obj1,obj2)-> obj2.profit-obj1.profit); // descending order

        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;
        for (int i = 0; i < jobs.size(); i++) {
            Job current = jobs.get(i);
            if (current.deadline>time){
                seq.add(current.id);
                time++;
            }
        }
        System.out.println(seq.size()+" = Max Jobs");
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
