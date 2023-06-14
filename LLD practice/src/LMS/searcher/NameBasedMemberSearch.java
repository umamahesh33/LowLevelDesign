package LMS.searcher;

import java.util.List;

public class NameBasedMemberSearch implements MemberSearcher{

    private final String memberName;

    public NameBasedMemberSearch(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public List<Member> search() {
        return null;
    }
}
