package euroinvestor.repos;

import oahu.dto.Tuple;
import oahu.financial.Derivative;
import oahu.financial.DerivativePrice;
import oahu.financial.StockPrice;
import oahu.financial.html.EtradeDownloader;
import oahu.financial.repository.EtradeRepository;
import oahu.financial.repository.StockMarketRepository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

public class EtradeRepositoryImpl implements EtradeRepository<Tuple<String>> {
    private EtradeDownloader downloader;
    private StockMarketRepository stockMarketRepository;

    @Override
    public Optional<DerivativePrice> findDerivativePrice(Tuple<String> optionInfo) {
        return Optional.empty();
    }

    @Override
    public Optional<StockPrice> stockPrice(String ticker) {
        return Optional.empty();
    }

    @Override
    public Optional<StockPrice> stockPrice(int oid) {
        return Optional.empty();
    }

    @Override
    public Collection<DerivativePrice> puts(String ticker) {
        return Collections.emptyList();
    }

    @Override
    public Collection<DerivativePrice> puts(int oid) {
        return Collections.emptyList();
    }

    @Override
    public Collection<DerivativePrice> calls(String ticker) {
        return Collections.emptyList();
    }

    @Override
    public Collection<DerivativePrice> calls(int oid) {
        return Collections.emptyList();
    }

    @Override
    public Collection<Derivative> callPutDefs(int oid) {
        return Collections.emptyList();
    }

    @Override
    public Collection<Derivative> callPutDefs(String ticker) {
        return Collections.emptyList();
    }

    @Override
    public void setDownloadDate(LocalDate localDate) {

    }

    @Override
    public void invalidateCache() {

    }

    public void setDownloader(EtradeDownloader downloader) {
        this.downloader = downloader;
    }

    public void setStockMarketRepository(StockMarketRepository stockMarketRepository) {
        this.stockMarketRepository = stockMarketRepository;
    }

}
