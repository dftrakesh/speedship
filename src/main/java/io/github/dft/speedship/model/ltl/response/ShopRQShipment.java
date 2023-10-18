package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.github.dft.speedship.model.ltl.request.HandlingCharge;
import io.github.dft.speedship.model.ltl.request.HandlingUnitList;
import io.github.dft.speedship.model.ltl.request.TotalWeight;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopRQShipment {
    public Boolean notifyBeforeDeliveryFlag;
    public TotalVolume totalVolume;
    public Boolean utilitySiteDeliveryFlag;
    public TotalDeclaredValue totalDeclaredValue;
    public Boolean militaryPickupFlag;
    public Boolean insideDeliveryFlag;
    public LargestLinearFeet largestLinearFeet;
    public Object deliverySpecialInstructions;
    public Boolean appointmentDeliveryFlag;
    public OriginalTotalVolume originalTotalVolume;
    public Boolean pierPortWarfPickupFlag;
    public Boolean securedLocationDeliveryFlag;
    public Boolean constructionSitePickupFlag;
    public Boolean tradeshowDeliveryFlag;
    public Boolean unspecifiedPickupFlag;
    public TotalLinearLength totalLinearLength;
    public BilledDestinationAddress billedDestinationAddress;
    public Boolean containerFreightStationDeliveryFlag;
    public Boolean callPCMilerApi;
    public Boolean constructionSiteDeliveryFlag;
    public Boolean pierPortWarfDeliveryFlag;
    public Boolean cemeteryDeliveryFlag;
    public Boolean carrierTerminalDeliveryFlag;
    public Integer totalHandlingUnitCount;
    public String sourceShipment;
    public Boolean isInternationalShipment;
    public String pickupSpecialInstructions;
    public Integer totalPcsCount;
    public Integer maxWeightOnHUPerPLT;
    public Boolean parkPickupFlag;
    public Boolean commercialDeliveryFlag;
    public TotalNewLimitsOfLiability totalNewLimitsOfLiability;
    public Boolean insuranceRequestFlag;
    public Boolean securedLocationPickupFlag;
    public Boolean mallShoppingCenterDeliveryFlag;
    public Boolean minePickupFlag;
    public Object tradeshowDeliveryName;
    public Boolean containerFreightStationPickupFlag;
    public Boolean limitedAccessAirportDeliveryFlag;
    public Boolean distributionCenterPickupFlag;
    public Boolean isSignatureRequired;
    public String insuredCommodityCategory;
    public Boolean insidePickupFlag;
    public Boolean carrierTerminalPickupFlag;
    public Boolean tradeshowPickupFlag;
    public Boolean liftgateDeliveryFlag;
    public Boolean limitedAccessPickupFlag;
    public Boolean limitedAccessGovernmentFacilityDeliveryFlag;
    public Boolean commercialPickupFlag;
    public Boolean protectionFromColdFlag;
    public Boolean isMultiClass;
    public Boolean mallShoppingCenterPickupFlag;
    public BilledOriginAddress billedOriginAddress;
    public String packageTypes;
    public List<ShipmentReferenceList> shipmentReferenceList;
    public String insuredMarksNumbers;
    public TimeInTransit timeInTransit;
    public Boolean protectionFromHeatFlag;
    public String shipmentDate;
    public List<HandlingUnitList> handlingUnitList;
    public Boolean limitedAccessAirportPickupFlag;
    public Boolean liftgatePickupFlag;
    public Boolean cemeteryPickupFlag;
    public AverageDensity averageDensity;
    public Boolean countryGolfDeliveryFlag;
    public Boolean holdAtTerminalFlag;
    public Boolean distributionCenterDeliveryFlag;
    public Boolean limitedAccessGovernmentFacilityPickupFlag;
    public Object tradeshowPickupName;
    public TotalOldLimitsOfLiability totalOldLimitsOfLiability;
    public Boolean parkDeliveryFlag;
    public Boolean countryGolfPickupFlag;
    public Boolean limitedAccessDeliveryFlag;
    public HandlingCharge handlingCharge;
    public Boolean mineDeliveryFlag;
    public Boolean utilitySitePickupFlag;
    public String specialInstructions;
    public Boolean militaryDeliveryFlag;
    public Boolean vendorBasePriceQualified;
    public TotalWeight totalWeight;
    public String insuredItemConditions;
    public Boolean residentialPickupFlag;
    public Boolean unspecifiedDeliveryFlag;
    public Boolean sortAndSegregateFlag;
    public Boolean residentialDeliveryFlag;
}