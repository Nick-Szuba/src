import java.util.LinkedList;

class ShowSummary {

    LinkedList<Show> daytime;
    LinkedList<Show> primetime;
    LinkedList<Show> latenight;

    ShowSummary()
    {
        this.daytime = new LinkedList<Show>();
        this.primetime = new LinkedList<Show>();
        this.latenight = new LinkedList<Show>();
    }

    ShowSummary(LinkedList<Show> daytime, LinkedList<Show> primetime, LinkedList<Show> latenight)
    {
        this.daytime = daytime;
        this.primetime = primetime;
        this.latenight = latenight;
    }
@Override
    public boolean equals(ShowSummary report){
       if(!(report instanceof ShowSummary)){
           return false;
       }
        ShowSummary reportH = (ShowSummary) report;
       return this.reportH(this.daytime, reportH.daytime) &&
               this.reportH(this.primetime, reportH.primetime) &&
               this.reportH(this.latenight, reportH.latenight);
    }

    private boolean reportH(LinkedList<Show> reportOne, LinkedList<Show> reportTwo){
        if(reportOne.size() != reportTwo.size()){
            return false;
        }
        for(int i = 0; i < reportOne.size(); i++){
            Show ShowOne = reportOne.get(i);
            Show ShowTwo = reportTwo.get(i);
                if(!ShowOne.title.equals(ShowTwo.title)){
                    return false;
                }
                else if(ShowOne.broadcastTime != ShowTwo.broadcastTime){
                    return false;
                }
        }
        return true;
    }
}
