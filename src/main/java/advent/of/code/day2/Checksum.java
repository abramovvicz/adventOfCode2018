/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package advent.of.code.day2;

import java.util.HashMap;
import java.util.Map;

public class Checksum {

    static int allTwo = 0;
    static int allThree = 0;
    static int checksum = 0;

    private static String input = "ubkfmdjxyzlbgkrotcepvswaqx\n" +
            "uikfmdkuyzlbgerotcepvswaqh\n" +
            "uikfmdpxyzlbgnrotcepvswoeh\n" +
            "nikfmdjxyzlbgnrotqepvswyqh\n" +
            "qgkfmdjxyzlbgnmotcepvswaqh\n" +
            "uikfmdjxyzqbgnrytcepvsbaqh\n" +
            "uikfmdjxyzibgprotcecvswaqh\n" +
            "uikfmajxyzlcgnrojcepvswaqh\n" +
            "uvkfsdjxyzlbgnrotcepvjwaqh\n" +
            "uikfmdjxfzlbggrotcepvswawh\n" +
            "uikfmhjxyzlbgnuotcepvjwaqh\n" +
            "uikfmdjxyzlbuzcotcepvswaqh\n" +
            "uikfmdwxyzlbgnrotcepvfwamh\n" +
            "uikfmdexyzlbgnroecepvswhqh\n" +
            "uikfmdjuyzlbgnrotcqpvswafh\n" +
            "uikfddjxyzvbgnrotceppswaqh\n" +
            "yikfwdjxyzlbgnrotcepvswagh\n" +
            "uiktmdjxyzlbgnrotceposwajh\n" +
            "uikfmdsxyzlbgnroteetvswaqh\n" +
            "uikfpdjxyzlbgnroncepvswuqh\n" +
            "uikfmtjxyzlbgurotcepvswaoh\n" +
            "eikfmdjxyjlbgnrotcepyswaqh\n" +
            "uikfkdjxyzlbgnrotcepvszaqv\n" +
            "uikfrdjxtwlbgnrotcepvswaqh\n" +
            "uikfmdjxyzlbgnrotpepwswahh\n" +
            "kikfmdjxyzlbgnkotcepvswqqh\n" +
            "uikfkduxyzlbgnrotcepvswafh\n" +
            "uikfxhjxyzlbgnrotcegvswaqh\n" +
            "uikfmdjxyzlmgnrotcenvawaqh\n" +
            "uzkfmddxyzlbgnrltcepvswaqh\n" +
            "uikfmdjxyzlbgnrobcepisqaqh\n" +
            "uijfmdjxyzlbgnrotcexvrwaqh\n" +
            "uiwjmdjxyzlbgnrotceprswaqh\n" +
            "uhkqmdjxwzlbgnrotcepvswaqh\n" +
            "uiktmsjxyzwbgnrotcepvswaqh\n" +
            "uikfmdjxyztbgnqotcepvswcqh\n" +
            "uibfmdjxyzlbgnroqcepvswaqx\n" +
            "uwkfmdjxyxlbgnrotcfpvswaqh\n" +
            "uikumdjxyzlbgnrstceposwaqh\n" +
            "uikfzdjxyznhgnrotcepvswaqh\n" +
            "uikuydjxyzlbgnrotqepvswaqh\n" +
            "uikfmdqxyzlbgnrotfefvswaqh\n" +
            "yikfmdjxyzlbrnrqtcepvswaqh\n" +
            "uiifmdjxyzlbenrotcfpvswaqh\n" +
            "uxkjmdjxyzlbgnrotcmpvswaqh\n" +
            "uikgmdjxyzlbgnrotceovlwaqh\n" +
            "uikfmdjxyzvbgzrotcenvswaqh\n" +
            "uiufmdjxyzlbgnrotceposwazh\n" +
            "uiafmdjxyzlignmotcepvswaqh\n" +
            "uikfmdjxyzwbgnsotlepvswaqh\n" +
            "uikjmdjvyzlbgnrotcenvswaqh\n" +
            "uikfmdjxyzlbonroteepvswaqi\n" +
            "uikfmdjxyzldgnroxcepviwaqh\n" +
            "uikvmdjxyzlbgdrotrepvswaqh\n" +
            "uikfmdjyyzwbgnrotcepvzwaqh\n" +
            "uikfmdjxyzzbnnvotcepvswaqh\n" +
            "uikomdjxyzlbgnrotcepvuwhqh\n" +
            "uikfmmjxyzbbgnrotcepvswayh\n" +
            "uikfmdjfezlbgprotcepvswaqh\n" +
            "uzkfmojxmzlbgnrotcepvswaqh\n" +
            "uipfmdjxyzlbgnrotceyuswaqh\n" +
            "uikfmdjxyzlkgnmotcepvswadh\n" +
            "uikfmdjxyzlbgnuctcbpvswaqh\n" +
            "uikfqdjxyzlbogrotcepvswaqh\n" +
            "uikfmdjxyzlfynrotcepvswash\n" +
            "uikfmdjxizzmgnrotcepvswaqh\n" +
            "uhkfmdjxyzlbhnrotcenvswaqh\n" +
            "uipfmdjxyzlbgorotcepfswaqh\n" +
            "uikfmdjxyznbgnrotcepvswfah\n" +
            "uikfmujxyzlbgnrotnepvssaqh\n" +
            "uikfmdjxyzlxgnrotcepvsrwqh\n" +
            "uikfmdjxszlbgnrottvpvswaqh\n" +
            "umkfmdskyzlbgnrotcepvswaqh\n" +
            "uikfmdjxyzlbgorotcwpzswaqh\n" +
            "uikfmdhxyzzbgnzotcepvswaqh\n" +
            "jikfmdjxyzlbgnrotcepveyaqh\n" +
            "uirfmdlxyzlbgnjotcepvswaqh\n" +
            "uikfmdjxyzlbgnrorxepvswazh\n" +
            "uikfmdjxyzltgnrotcepvsxaqi\n" +
            "uikfmdjxyzlbxlrotcepkswaqh\n" +
            "uvkfmdjxyzlbgnrotcopvswxqh\n" +
            "uxkfmdjxkzlbgnrotcepvswqqh\n" +
            "uikfmdjxyzlbqnrotcepvhwrqh\n" +
            "uikfmdjxyzlvgnrolcepvswrqh\n" +
            "urkfmdixyzlbgnrotcepvsjaqh\n" +
            "uikfmdjxymlbsnrotcepvswcqh\n" +
            "uikfmdjxyilbgnrotcepvcwzqh\n" +
            "uikfadjxlzlbgnrotcepvswaql\n" +
            "uikfmdjxuzlbgdrotcgpvswaqh\n" +
            "yikfmdgxyzlbgnrotcepvswarh\n" +
            "uikfmdjxyzlbgorotcepcswaqv\n" +
            "uikkmdjxyzlbvnrotcepvvwaqh\n" +
            "uwzfmdjxyxlbgnrotcfpvswaqh\n" +
            "uikfmdjxyztbgnrotcrtvswaqh\n" +
            "uiufmdjxyzhbgnrotcupvswaqh\n" +
            "uikfzdjcyzlbgnrotcfpvswaqh\n" +
            "uipfmdjxyzlbgnrotavpvswaqh\n" +
            "uikfmajxyzlbgnrotcepbsxaqh\n" +
            "uikfmdjfyzlbgnrotbepvswmqh\n" +
            "gikkmdjxyzlbgnrptcepvswaqh\n" +
            "uikfmdjxqvlbgnrotsepvswaqh\n" +
            "fikfmdjxyzlbgnrotcegvswoqh\n" +
            "idkfmdjxyzlbgnrotcepwswaqh\n" +
            "uikfmdqxyzlbmnrobcepvswaqh\n" +
            "uikfmdjxyzpbgnroicepvsyaqh\n" +
            "uikfmkoxyzlbgnrotcgpvswaqh\n" +
            "unkfmdjxyzlbpnrolcepvswaqh\n" +
            "uikfmdjmyzlbgfrotcupvswaqh\n" +
            "ujkfmdjxynlbgnroteepvswaqh\n" +
            "uikfmljxyzlbgnaotcepvsiaqh\n" +
            "uikfmdjdyzlbgnrotcepvtwaqd\n" +
            "uikfmdjxyzlbgnyotcepimwaqh\n" +
            "uikfmdjxyzfbjnrotcepvxwaqh\n" +
            "eiwfmdjxyzlbgnrdtcepvswaqh\n" +
            "umkhmdjxyzlbgnrotceivswaqh\n" +
            "uikfmdjxyzlbgnrotcwpvswneh\n" +
            "uckfmdjxyzlbknrotcepvswauh\n" +
            "uiofmdjoyzlbgnrbtcepvswaqh\n" +
            "uikfmdbxyzlbgnrotcepaslaqh\n" +
            "uimfmdjxyalbgnrotcepvswaxh\n" +
            "uqkfmdjxyzlbwnrotcepmswaqh\n" +
            "uiyfmdjxyzlbgnrotcepvswxuh\n" +
            "uikfmdjxyzlbgmrotgepvswamh\n" +
            "uikfmdjxyqlbgarozcepvswaqh\n" +
            "uikfmdjxyzabanpotcepvswaqh\n" +
            "uikfmdjgyzlbsnrotcepvswaqj\n" +
            "uikfmdjxyzlbwnrottepvsvaqh\n" +
            "uikfmdjxyzlbbnrotcepvofaqh\n" +
            "uikfudjxyzlbgnustcepvswaqh\n" +
            "cskfmqjxyzlbgnrotcepvswaqh\n" +
            "uiwfmddxyzlbgnrotccpvswaqh\n" +
            "eikpmdjxyzlbgnrotcesvswaqh\n" +
            "uikfmdzxyzlngnrrtcepvswaqh\n" +
            "uikfmdjxyzlbgnrotcepaswtph\n" +
            "uirfmdjxyzlbgnrotcepvswsqe\n" +
            "uikjmdjxqzlbgirotcepvswaqh\n" +
            "uikfmdjxsllbknrotcepvswaqh\n" +
            "uikfmdjxyqlbgcrotcepvswaqu\n" +
            "uikfmdjsymlbgnrotcebvswaqh\n" +
            "uikfmdjxezlbgnroccepviwaqh\n" +
            "uikfmdjiyzjbgnrotcepvswarh\n" +
            "uqkfmdjxyzmbgnrotcepvslaqh\n" +
            "unkfmdjxyzlbinrotceplswaqh\n" +
            "uikfmdjxyzpbgnrjtcedvswaqh\n" +
            "uicfmdjxyzlbgrrotcepvswamh\n" +
            "ukknmdjxyzlbgnqotcepvswaqh\n" +
            "uikfudjxyzlbdnrztcepvswaqh\n" +
            "uikfmdjxyzlbgnrozcepvswawk\n" +
            "uikfmduxyzsbgnrotcepvswauh\n" +
            "uikfmdjxyzljbnrotcenvswaqh\n" +
            "uukfmdjxyzlbgnrotcckvswaqh\n" +
            "uilfldjxyzlbgnrotcdpvswaqh\n" +
            "uckfmdjxyvybgnrotcepvswaqh\n" +
            "qikfmdjxyglbgnrotcepvrwaqh\n" +
            "uikfmhjxyzltgnrotcepvswbqh\n" +
            "uikfmdjxipabgnrotcepvswaqh\n" +
            "uikfmdjxyzlbgnrotceovswanl\n" +
            "uikfmdjxyzlbgirotcapvswahh\n" +
            "uikfucjxyflbgnrotcepvswaqh\n" +
            "pikfmdjxyzpbgnrotcepvswaeh\n" +
            "uikfmdjiyylbgnrotcervswaqh\n" +
            "uikfmdjgyzlbgnrotcaevswaqh\n" +
            "uikvmdjxyzlbunrotcepvswarh\n" +
            "uikfadjuyzpbgnrotcepvswaqh\n" +
            "uikfmdjxyzlbgnrotcepsawaqj\n" +
            "eikfmdjxyflbgnrotcepvswaeh\n" +
            "uisfmdaxyzlbgnrotcepvswlqh\n" +
            "vikfmdjxyzlzgnrotcepvswanh\n" +
            "ukkfmdoxyzlbgnrotcewvswaqh\n" +
            "uikfmdhxyzlbgnrotcrpvbwaqh\n" +
            "uhkfmdjwezlbgnrotcepvswaqh\n" +
            "uikfddjxyzlbgnroteepvpwaqh\n" +
            "uikfmdjxczlbgncotiepvswaqh\n" +
            "uikfvdjxyzlbgnrotcnpvsaaqh\n" +
            "uikfmdjxyzlbgnritcepvlwmqh\n" +
            "uikfmdjxczlcgnrotcecvswaqh\n" +
            "mikfmdjxyzlbgnrotcepvswasi\n" +
            "uifvmdjxyzlbgnrotpepvswaqh\n" +
            "uikzmdjxyzlbgnrotrepvswaqs\n" +
            "uikfmqjqyzlbunrotcepvswaqh\n" +
            "uikfpdyxyzlbgnrotcepvswagh\n" +
            "uikfmdjxyzobgnrotrlpvswaqh\n" +
            "zisdmdjxyzlbgnrotcepvswaqh\n" +
            "uikfmdjxyzlbgnlotiesvswaqh\n" +
            "uikfddixyzlbgnroucepvswaqh\n" +
            "uijfmdrxyzlbgnrotoepvswaqh\n" +
            "uikfmdcxbzlbgnrotcepvpwaqh\n" +
            "uikfmdjxxzlbfnrotcecvswaqh\n" +
            "upkfmdjxyzmtgnrotcepvswaqh\n" +
            "uikfmdrxyzlbgnrjtcepvswaqp\n" +
            "uizfmdjxyzlbsnrotcepviwaqh\n" +
            "uidfmdjxyslbgnrotcxpvswaqh\n" +
            "uikfmdjxyzlbgnrovyepvsdaqh\n" +
            "uiafmdjxyzlbgnrxtcepvsdaqh\n" +
            "ugkfmdjxyzlbgnrodcepvswawh\n" +
            "pikfmtjxyzhbgnrotcepvswaqh\n" +
            "uikfmdjxyzlfgnvotcepvswtqh\n" +
            "uikbmdjxyzlbgerotcepvswaqm\n" +
            "uikfmdjxyhlbdnrotcepvswaqy\n" +
            "uikfgdjxyzlbgnhotcepvswdqh\n" +
            "uikfmdpxyzlbgnrotcepvscanh\n" +
            "uikfmdjxyzsbgnretcepvswaqn\n" +
            "uikfddjxyzlrgnrotcepvsbaqh\n" +
            "uikfmdjxyzlbgnrotcqnrswaqh\n" +
            "uhkfmejxyzlbgnrotvepvswaqh\n" +
            "uikimdjxyzlngnrotceprswaqh\n" +
            "uikfmdjxyzwbunrotiepvswaqh\n" +
            "rikfmdjxyzlbgnrotcypvssaqh\n" +
            "uikfmdjxyzlbdnrotcrpvswsqh\n" +
            "uekfmdjxkzlbznrotcepvswaqh\n" +
            "uikfmdjxyglbgvrotcepvswaqv\n" +
            "uikfmcjxyzlbgnrotmeovswaqh\n" +
            "uikfmdjxyznbgnrozcepvswaqm\n" +
            "uikfmdjxyzlbdnrotcepdsyaqh\n" +
            "umkfmdjxfzlbgnrotiepvswaqh\n" +
            "uitfmdjxyzvbcnrotcepvswaqh\n" +
            "uikfmdjqyzlbgnrvtcepvlwaqh\n" +
            "uikfmdjxyzkbworotcepvswaqh\n" +
            "uikfmdzxyzlbwnrotcypvswaqh\n" +
            "uikfmdjxyklbgnrftyepvswaqh\n" +
            "uinfmsjxyzlbgnrotcepsswaqh\n" +
            "xisfmdjxymlbgnrotcepvswaqh\n" +
            "uikfmdjxjzlbgnropcepvswaqv\n" +
            "uikfmdjxyalegyrotcepvswaqh\n" +
            "uikfydjxyzlbgnrotcekvswtqh\n" +
            "uikwmojxyzlbgnromcepvswaqh\n" +
            "uikdmdjayzlbgnrotcepvswzqh\n" +
            "uikfmdjxyzlmvnrotctpvswaqh\n" +
            "uikfmbjxyzlbgnrotceptsweqh\n" +
            "yvkfmdjxyzlbgqrotcepvswaqh\n" +
            "uikomdjxfxlbgnrotcepvswaqh\n" +
            "uikfmdjxczlbgnroocepgswaqh\n" +
            "uikemdjxizlbgnrotcegvswaqh\n" +
            "uikdmdjxyzlbgwrotceprswaqh\n" +
            "tiyfmdjfyzlbgnrotcepvswaqh\n" +
            "tmkfmdjxyzlbgirotcepvswaqh\n" +
            "uikfmdjxyzebgnzotcepqswaqh\n" +
            "uikfmljxyzlbgnrwtcepvswaeh\n" +
            "uikfmojxyzlbgnrotcepbswwqh\n" +
            "uikfmdjxyzlbgsrotcewvswwqh\n" +
            "uikfmdjhyzlbgdrogcepvswaqh\n" +
            "uikfmvjxyzlbrnrltcepvswaqh\n" +
            "jikfmdjxyzlbgnrotcepvgcaqh\n" +
            "uikhtdjxyzlbgnrotcepvswarh\n" +
            "uikfmdjxyezbgnritcepvswaqh\n" +
            "uikfwdjxyzlbgnrotzepvsnaqh\n" +
            "uikfmdjxqylbgnrobcepvswaqh\n" +
            "zikzmdjxyzlbgnrhtcepvswaqh\n" +
            "uiksmzjxyzlbgnrftcepvswaqh\n" +
            "uikfmdjxuzlbgnrotcepvsvaqc";


    public static void main(String[] args) {

        String[] data = input.split("\n");

        for (int i = 0; i < data.length; i++) {
            System.out.println(i + " /////////");
            outPutMap2(countNumberOfLetters(data[i]));

        }


    }

    private static void outPutMap2(Map<Character, Integer> map) {

        int wystapenieDwochTakichSamychLiter = 0;
        int wystapienieTrzechTakichSamychLiter = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {   // Mp.Entry klasa, która posiada klucz i wartość
            //mapa przechowuje obiekty
//                System.out.println("Klucz  " + entry.getKey() + " wartość " + entry.getValue());

            if (entry.getValue() == 2) {
                wystapenieDwochTakichSamychLiter++;
            }
            if (entry.getValue() == 3) {
                wystapienieTrzechTakichSamychLiter++;
            }

        }

        if (wystapenieDwochTakichSamychLiter >= 1) {
            allTwo += 1;
        }
        if (wystapienieTrzechTakichSamychLiter >= 1) {
            allThree += 1;
        }


        checksum = allTwo * allThree;
        System.out.println("ilość wystąpienia 2 takich samych liter: " + wystapenieDwochTakichSamychLiter);
        System.out.println("ilośc wystąpenia 3 takich samich liter: " + wystapienieTrzechTakichSamychLiter);

        System.out.println("suma wszystkich par:" + allTwo);
        System.out.println("suma wszystkich potrójnych :" + allThree);

        System.out.println("checksum is: " + checksum);
    }

    private static Map<Character, Integer> countNumberOfLetters(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char s = text.charAt(i);
            if (map.get(s) == null) {
                map.put(s, 1);
            } else {
                //int liczbaWystapein = map.get(s);
                map.put(s, map.get(s) + 1); // PUT nadpisuje poprzednią wartość
                //dzięki mapie mamy dynamiczne tworzenie zmiennych (można dodawać juz do elementów kolejne elementy
            }
            //przerobić na krótki if
        }
        return map;
    }

}
