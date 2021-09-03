package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import com.kodilla.testing.collection.OddNumbersExterminator;



import java.util.ArrayList;
import java.util.List;


public class CollectionTestSuite {

   OddNumbersExterminator exterminator = new OddNumbersExterminator();

       @BeforeEach
       public void before() {
           System.out.println("begin");
       }

       @AfterEach
       public void after() {
           System.out.println("end");
       }

       @DisplayName(
                "checking behavior when list is empty"
        )

        @Test
        public void testOddNumbersExterminatorEmptyList() {


            //Arrange
            List<Integer> eList = new ArrayList<>();

            //Act
            List<Integer> rList = exterminator.exterminate(eList);

            System.out.println("Test");

            //Assert
            Assertions.assertEquals(eList, rList);
        }

        @DisplayName(
                "checking behavior when list is full"
        )

        @Test
        public void testOddNumbersExterminatorNormalsList() {

            //Arrange
           List<Integer> fList = new ArrayList<>();

            fList.add(4);
            fList.add(7);
            fList.add(21);
            fList.add(29);
            fList.add(5);
            fList.add(13);
            fList.add(16);
            fList.add(9);
            fList.add(20);
            fList.add(12);

            //Act
            List<Integer> r1List = exterminator.exterminate(fList);

            System.out.println("Test");

            //Assert
            Assertions.assertEquals(fList, r1List);

        }

}


