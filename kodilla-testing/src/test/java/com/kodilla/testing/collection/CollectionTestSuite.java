package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import com.kodilla.testing.collection.OddNumbersExterminator;



import java.util.ArrayList;
import java.util.Arrays;
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


            //Given
            List<Integer> eList = new ArrayList<>();

            //When
            List<Integer> rList = exterminator.exterminate(eList);

            System.out.println("Test");

            //Then
            Assertions.assertEquals(eList, rList);
        }

        @DisplayName(
                "checking behavior when list is full"
        )

        @Test
        public void testOddNumbersExterminatorNormalsList() {

            //Given
          List<Integer> fList = new ArrayList<>();

            fList.add(4);
            fList.add(7);
            fList.add(22);

            List<Integer> expList = new ArrayList<>();

            expList.add(4);
            expList.add(22);

            //When
                    List<Integer> r1List = exterminator.exterminate(fList);
                    System.out.println("Test");
            //Then
           Assertions.assertEquals(expList, r1List);




        }

}

