import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

public class ManagerRepoTest {
    ManagerRepo managerRepo=new ManagerRepo(3);
    PosterItem item1 =new PosterItem("lalala");
    PosterItem item2=new PosterItem("flash");
    PosterItem item3=new PosterItem("Remark");
    PosterItem item4=new PosterItem("flash");
    PosterItem item5=new PosterItem("Remark");
    PosterItem item6=new PosterItem("flash");
    PosterItem item7=new PosterItem("Remark");
    PosterItem item8=new PosterItem("flash");
    PosterItem item9=new PosterItem("Remark");
    PosterItem item10=new PosterItem("flash");
    PosterItem item11=new PosterItem("Remark");
    PosterItem item12=new PosterItem("flash");


    @BeforeEach
    public void setup(){
        managerRepo.addPost(item1);
        managerRepo.addPost(item2);
        managerRepo.addPost(item3);
        managerRepo.addPost(item4);
        managerRepo.addPost(item5);
        managerRepo.addPost(item6);
        managerRepo.addPost(item7);
        managerRepo.addPost(item8);
        managerRepo.addPost(item9);
        managerRepo.addPost(item10);
        managerRepo.addPost(item11);
        managerRepo.addPost(item12);

    }
    @Test
    public void ManagerTest(){
        ManagerRepo repo = new ManagerRepo();
        repo.addPost(item1);
        repo.addPost(item2);
        repo.addPost(item3);
        PosterItem[] expected={item1,item2,item3};
        PosterItem[] actual=repo.getPostItem();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void findLastTest(){
        PosterItem[] expected={item12,item11,item10};
        PosterItem[] actual=managerRepo.findLast();
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void managerDrfoltFindLastTest(){
        ManagerRepo repo=new ManagerRepo();
        repo.addPost(item1);
        repo.addPost(item2);
        repo.addPost(item3);
        repo.addPost(item4);
        repo.addPost(item5);
        repo.addPost(item6);
        repo.addPost(item7);
        repo.addPost(item8);
        repo.addPost(item9);
        repo.addPost(item10);
        PosterItem[] expected={item10,item9,item8,item7,item6,item5,item4,item3,item2,item1};
        PosterItem[] actual= repo.findLast();
        Assertions.assertArrayEquals(expected,actual);


    }


}
