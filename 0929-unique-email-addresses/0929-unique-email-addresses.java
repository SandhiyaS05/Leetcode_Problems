class Solution {
    public int numUniqueEmails(String[] emails) {
       HashSet<String> set = new HashSet<>();

        for (String email : emails) {

            StringBuilder sb = new StringBuilder();
            int i = 0;

            // Process local name
            while (email.charAt(i) != '@') {

                if (email.charAt(i) == '+') {
                    while (email.charAt(i) != '@') {
                        i++;
                    }
                    break;
                }

                if (email.charAt(i) != '.') {
                    sb.append(email.charAt(i));
                }

                i++;
            }

            // Add domain name
            while (i < email.length()) {
                sb.append(email.charAt(i));
                i++;
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}