public class ManagerRepo {
    private PosterItem[] poster=new PosterItem[0];
    int countLastPoster=10;
    public ManagerRepo(){}
    public ManagerRepo(int countLastPoster){
        this.countLastPoster=countLastPoster;
    }
    public void addPost(PosterItem item){
        PosterItem[] tmp=new PosterItem[poster.length+1];
        for(int i=0;i<poster.length;i++){
            tmp[i]=poster[i];

        }
        tmp[tmp.length-1]=item;
        poster=tmp;
    }
    public PosterItem[] findLast(){
        PosterItem[] all=getPostItem();
        PosterItem[] reversed=new PosterItem[all.length];
        PosterItem[] findLastItem=new PosterItem[countLastPoster];
        for(int i=0;i<reversed.length;i++){
            reversed[i]=all[all.length-1-i];
        }
        for (int j=0;j<findLastItem.length;j++){
            findLastItem[j]=reversed[j];
        }
        return findLastItem;
    }
    public PosterItem[] getPostItem(){
        return poster;
    }
}
