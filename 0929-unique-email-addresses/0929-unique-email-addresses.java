class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uEmails = new HashSet<>();

        for (String s : emails) {
            String[] parts = s.split("@");

            String local = parts[0];
            String domain = parts[1];

            int plusIdx = local.indexOf("+");

            if (plusIdx != -1) {
                local = local.substring(0, plusIdx);
            }

            local = local.replace(".", "");

            uEmails.add(local + "@" + domain);

        }
        return uEmails.size();
    }
}