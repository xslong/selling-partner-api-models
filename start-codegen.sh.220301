#!/bin/bash

models=(
  # 生成包名 接口定义json文件
  "apluscontent" "models/aplus-content-api-model/aplusContent_2020-11-01.json"
  "authorization" "models/authorization-api-model/authorization.json"
  "catalogitems" "models/catalog-items-api-model/catalogItems_2020-12-01.json"
  "fbainboundeligibility" "models/fba-inbound-eligibility-api-model/fbaInbound.json"
  "fbainventory" "models/fba-inventory-api-model/fbaInventory.json"
  "fbasmallandlight" "models/fba-small-and-light-api-model/fbaSmallandLight.json"
  "feeds" "models/feeds-api-model/feeds_2020-09-04.json"
  "finances" "models/finances-api-model/financesV0.json"
  "fulfillmentinbound" "models/fulfillment-inbound-api-model/fulfillmentInboundV0.json"
  "fulfillmentoutbound" "models/fulfillment-outbound-api-model/fulfillmentOutbound_2020-07-01.json"
  "merchantfulfillment" "models/merchant-fulfillment-api-model/merchantFulfillmentV0.json"
  "messaging" "models/messaging-api-model/messaging.json"
  "notifications" "models/notifications-api-model/notifications.json"
  "orders" "models/orders-api-model/ordersV0.json"
  "productfees" "models/product-fees-api-model/productFeesV0.json"
  "productpricing" "models/product-pricing-api-model/productPricingV0.json"
  "reports" "models/reports-api-model/reports_2021-06-30.json"
  "sales" "models/sales-api-model/sales.json"
  "sellers" "models/sellers-api-model/sellers.json"
  "services" "models/services-api-model/services.json"
  "shipping" "models/shipping-api-model/shipping.json"
  "solicitations" "models/solicitations-api-model/solicitations.json"
  "tokens" "models/tokens-api-model/tokens_2021-03-01.json"
  "uploads" "models/uploads-api-model/uploads_2020-11-01.json"
)

len=${#models[@]}
echo "module len is $len"

package="com.amazon.spapi"
outpath="api-code"

# 删除旧的接口代码
#rm -f "$outpath/src/main/java/com/amazon/spapi/api/*Api.java"
#rm -f "$outpath/src/main/java/com/amazon/spapi/model/"

for((i=0;i<len;i+=2))
do
  modelName=${models[i]}
  modelJson=${models[i+1]}
  echo "$modelName > $modelJson"

  java -jar swagger-codegen-cli-2.4.19.jar generate -i $modelJson -l java -o $outpath -t clients/sellingpartner-api-aa-java/resources/swagger-codegen/templates/ -c swagger-codegen-cli-config.json \
  -DgroupId="$package" \
  -DartifactId="selling-partner-api" \
  -DartifactVersion="v2021-04-20" \
  -DinvokerPackage="$package" \
  -DmodelPackage="$package.model.$modelName" \
  -DapiPackage="$package.api" \
  --import-mappings Error="$package.model.Error",ErrorList="$package.model.ErrorList"

done

cp -r "clients/sellingpartner-api-aa-java/src/com/amazon/SellingPartnerAPIAA" "$outpath/src/main/java/com/amazon/"
cp -r "clients/sellingpartner-api-documents-helper-java/src/main/java/com/amazon/spapi/documents" "$outpath/src/main/java/com/amazon/spapi/"


 # java -jar swagger-codegen-cli-2.4.13.jar generate -i models/sellers-api-model/sellers.json -l java -o api-code -t clients/sellingpartner-api-aa-java/resources/swagger-codegen/templates/ -c swagger-codegen-cli-config.json
