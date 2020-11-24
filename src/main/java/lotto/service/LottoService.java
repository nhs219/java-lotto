package lotto.service;

import lotto.domain.Lotto;
import lotto.domain.LottoConstraint;
import lotto.domain.Pick;
import lotto.domain.Prize;
import lotto.domain.enums.Rank;

import java.util.Collection;
import java.util.Map;

public class LottoService {
    private final Lotto lotto;

    public LottoService(int price, LottoConstraint lottoConstraint, AbstractPrizePackager prizePackager) {
        lotto = new Lotto(price, lottoConstraint, prizePackager.pack());
    }

    public Integer getPrice() {
        return lotto.getPrice();
    }

    public LottoConstraint getConstraint() {
        return lotto.getConstraint();
    }

    public Rank checkRank(Pick pick, Collection<Integer> winningBalls) {
        return this.lotto.checkRank(pick, winningBalls);
    }

    public Map<Rank, Prize> getPrizeMap() {
        return lotto.getPrizeMap();
    }
}