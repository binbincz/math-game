package com.my.test.junit;


import com.my.test.Game;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by yuan on 2019/4/22.
 */
public class MyJUnitJupiterTests {

    Game game = new Game();

    @Test
    public void test1() {
        game.rule1();
    }

    @Test
    public void test2() {
        game.rule2();
    }

    @Test
    public void test3() {
        game.rule3();
    }

    @Test
    public void test4() {
        game.rule4();
    }

}
