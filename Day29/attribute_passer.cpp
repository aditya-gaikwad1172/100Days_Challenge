#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, q;
    cin >> n >> q;
    cin.ignore();

    map<string, string> mp;
    vector<string> tagStack;

    for (int i = 0; i < n; i++) {
        string line;
        getline(cin, line);

        // Closing tag
        if (line.substr(0, 2) == "</") {
            tagStack.pop_back();
        }
        else {
            // Remove < > "
            line.erase(remove(line.begin(), line.end(), '<'), line.end());
            line.erase(remove(line.begin(), line.end(), '>'), line.end());
            line.erase(remove(line.begin(), line.end(), '"'), line.end());

            stringstream ss(line);
            string tag;
            ss >> tag;

            // Build full tag path
            string fullTag = tag;
            if (!tagStack.empty())
                fullTag = tagStack.back() + "." + tag;

            tagStack.push_back(fullTag);

            // Read attributes
            string attr, eq, val;
            while (ss >> attr >> eq >> val) {
                mp[fullTag + "~" + attr] = val;
            }
        }
    }

    // Answer queries
    while (q--) {
        string query;
        getline(cin, query);

        if (mp.find(query) != mp.end())
            cout << mp[query] << endl;
        else
            cout << "Not Found!" << endl;
    }

    return 0;
}
