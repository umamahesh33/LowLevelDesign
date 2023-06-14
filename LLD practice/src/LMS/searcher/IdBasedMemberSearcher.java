package LMS.searcher;

import java.lang.reflect.Member;
import java.util.List;

public class IdBasedMemberSearcher implements MemberSearcher{
    private final long memberId;

    public IdBasedMemberSearcher(long memberId) {
        this.memberId = memberId;
    }

    @Override
    public List<Member> search() {
        return null;
    }
}
