package az.stepit.booking.service.impl;

import az.stepit.booking.annotation.ServiceMethod;
import az.stepit.booking.dao.dto.Advertisement;
import az.stepit.booking.dao.dto.SearchDTO;
import az.stepit.booking.dao.mapper.AdvertisementMapper;
import az.stepit.booking.dao.repository.AdvertisementRepository;
import az.stepit.booking.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static az.stepit.booking.constant.ServiceNames.ADVERTISEMENT;

@Service(ADVERTISEMENT)
public class AdvertisementServiceImpl implements AbstractService<Advertisement, Long> {


    @Autowired
    private AdvertisementRepository advertisementRepository;

    @Autowired
    private AdvertisementMapper advertisementMapper;

    @Override
    @ServiceMethod
    public List<Advertisement> findAll(SearchDTO searchDTO) {
        List<Advertisement> advertisements = advertisementMapper.getAllAdvertisementByFilter(searchDTO);
        return advertisements;
    }

    @Override
    @ServiceMethod
    public Advertisement save(Advertisement advertisement) {
        if (Objects.isNull(advertisement)) throw new RuntimeException("Advertisement is not entered");
        return advertisementRepository.save(advertisement);
    }


    @Override
    @ServiceMethod(name = "customUpdate")
    public Advertisement update(Advertisement advertisement) {
        if (Objects.isNull(advertisement)) throw new RuntimeException("Advertisement is not entered");
        if (Objects.isNull(advertisement.getId()))
            throw new RuntimeException("Bad advertisement data");
        if (!advertisementRepository.existsById(advertisement.getId()))
            throw new RuntimeException("Nothing to update");
        return advertisementRepository.save(advertisement);
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        advertisementRepository.deleteById(id);

    }

    @Override
    public Advertisement getById(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        Optional<Advertisement> advertisment = advertisementRepository.findById(id);
        if (advertisment.isPresent())
            return advertisment.get();
        throw new RuntimeException("Advertisement is not found");
    }

    @Override
    public List<Advertisement> findAll() {
        List<Advertisement> advertisements = (List<Advertisement>) advertisementRepository.findAll();
        return advertisements
                .parallelStream()
                .collect(Collectors.toList());
    }

}
