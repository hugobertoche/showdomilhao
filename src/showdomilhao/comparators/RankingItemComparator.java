/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdomilhao.comparators;

import java.util.Comparator;
import showdomilhao.models.RankItem;

/**
 *
 * @author hugobertoche
 */
public class RankingItemComparator implements Comparator<RankItem>{
    @Override
    public int compare(RankItem a, RankItem b) {
        return a.pontuacao < b.pontuacao ? -1 : a.pontuacao == b.pontuacao ? 0 : 1;
    }
}
