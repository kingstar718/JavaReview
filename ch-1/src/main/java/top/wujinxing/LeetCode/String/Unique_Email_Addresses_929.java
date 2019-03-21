package top.wujinxing.LeetCode.String;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: wujinxing
 * @date: 2019/3/21 09:41
 * @description: 出去email的.和+ 可以生成多少种不同的email地址
 *
 * Every email consists of a local name and a domain name, separated by the @ sign.
 *
 * For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
 *
 * Besides lowercase letters, these emails may contain '.'s or '+'s.
 *
 * If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)
 *
 * If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)
 *
 * It is possible to use both of these rules at the same time.
 *
 * Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?
 */
public class Unique_Email_Addresses_929 {
    public int numUniqueEmails(String[] emails){
        Set<String> seen = new HashSet<>();
        for (String email : emails){
            int i = email.indexOf('@');
            String local = email.substring(0, i);
            String rest = email.substring(i);
            if (local.contains("+")){
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.replaceAll("\\.","");
            seen.add(local + rest);
        }
        return seen.size();
    }

    @Test
    public void test(){

        String[] test1 = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        String[] test2 = {"testemail@leetcode.com","tstemail1@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(test1));
        System.out.println(numUniqueEmails(test2));
    }
}
