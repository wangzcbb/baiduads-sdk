# coding: utf-8

# flake8: noqa
"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

# import models into model package
from baiduads.advice.model.accept_advice_request_wrapper import AcceptAdviceRequestWrapper
from baiduads.advice.model.accept_advice_response_wrapper import AcceptAdviceResponseWrapper
from baiduads.advice.model.accept_advice_response_wrapper_body import AcceptAdviceResponseWrapperBody
from baiduads.advice.model.accept_feed_advice_request_wrapper import AcceptFeedAdviceRequestWrapper
from baiduads.advice.model.accept_feed_advice_response_wrapper import AcceptFeedAdviceResponseWrapper
from baiduads.advice.model.accept_feed_advice_response_wrapper_body import AcceptFeedAdviceResponseWrapperBody
from baiduads.advice.model.accept_info import AcceptInfo
from baiduads.advice.model.adgroup_auto_targeting_info import AdgroupAutoTargetingInfo
from baiduads.advice.model.adgroup_auto_targeting_type import AdgroupAutoTargetingType
from baiduads.advice.model.advice_accept_param import AdviceAcceptParam
from baiduads.advice.model.advice_accept_type import AdviceAcceptType
from baiduads.advice.model.advice_detail_query_request import AdviceDetailQueryRequest
from baiduads.advice.model.advice_mod_request import AdviceModRequest
from baiduads.advice.model.advice_query_request import AdviceQueryRequest
from baiduads.advice.model.advice_type import AdviceType
from baiduads.advice.model.auto_orientation_type import AutoOrientationType
from baiduads.advice.model.budget_adjust_time_type import BudgetAdjustTimeType
from baiduads.advice.model.business_label_accept_info import BusinessLabelAcceptInfo
from baiduads.advice.model.business_label_type import BusinessLabelType
from baiduads.advice.model.campaign_budget_type import CampaignBudgetType
from baiduads.advice.model.campaign_est_budget_accept_info import CampaignEstBudgetAcceptInfo
from baiduads.advice.model.campaign_est_budget_type import CampaignEstBudgetType
from baiduads.advice.model.campaign_info import CampaignInfo
from baiduads.advice.model.campaign_rec_budget_accept_info import CampaignRecBudgetAcceptInfo
from baiduads.advice.model.creative_preview_type import CreativePreviewType
from baiduads.advice.model.creative_recommend_accept_info import CreativeRecommendAcceptInfo
from baiduads.advice.model.creative_recommend_type import CreativeRecommendType
from baiduads.advice.model.detail_query_condition import DetailQueryCondition
from baiduads.advice.model.download_advice_request_wrapper import DownloadAdviceRequestWrapper
from baiduads.advice.model.download_advice_response_wrapper import DownloadAdviceResponseWrapper
from baiduads.advice.model.download_advice_response_wrapper_body import DownloadAdviceResponseWrapperBody
from baiduads.advice.model.ecpc_campaign_type import EcpcCampaignType
from baiduads.advice.model.feed_account_budget_accept_info import FeedAccountBudgetAcceptInfo
from baiduads.advice.model.feed_auto_bid_type import FeedAutoBidType
from baiduads.advice.model.feed_budget_base_type import FeedBudgetBaseType
from baiduads.advice.model.feed_campaign_auto_bid_accept_info import FeedCampaignAutoBidAcceptInfo
from baiduads.advice.model.feed_campaign_auto_bid_type import FeedCampaignAutoBidType
from baiduads.advice.model.feed_campaign_budget_accept_info import FeedCampaignBudgetAcceptInfo
from baiduads.advice.model.feed_creative_accept_info import FeedCreativeAcceptInfo
from baiduads.advice.model.feed_creative_detail_type import FeedCreativeDetailType
from baiduads.advice.model.feed_ocpc_type import FeedOcpcType
from baiduads.advice.model.feed_plugin_info import FeedPluginInfo
from baiduads.advice.model.feed_plugin_type import FeedPluginType
from baiduads.advice.model.field_filter import FieldFilter
from baiduads.advice.model.industry_url_accept_info import IndustryUrlAcceptInfo
from baiduads.advice.model.industry_url_type import IndustryUrlType
from baiduads.advice.model.key_word_type import KeyWordType
from baiduads.advice.model.keyword_accept_info import KeywordAcceptInfo
from baiduads.advice.model.keyword_uncorrelated_accept_info import KeywordUncorrelatedAcceptInfo
from baiduads.advice.model.land_page_quality_api_type import LandPageQualityApiType
from baiduads.advice.model.landing_page_correlation_info import LandingPageCorrelationInfo
from baiduads.advice.model.landing_page_info import LandingPageInfo
from baiduads.advice.model.landing_page_type import LandingPageType
from baiduads.advice.model.material_offline_reason import MaterialOfflineReason
from baiduads.advice.model.ngt_word_accept_info import NgtWordAcceptInfo
from baiduads.advice.model.ngt_word_type import NgtWordType
from baiduads.advice.model.ocpc_bid_advice_effect import OcpcBidAdviceEffect
from baiduads.advice.model.ocpc_price_info import OcpcPriceInfo
from baiduads.advice.model.ocpc_price_type import OcpcPriceType
from baiduads.advice.model.ocpc_trans_type_accept_info import OcpcTransTypeAcceptInfo
from baiduads.advice.model.ocpc_trans_type_info import OcpcTransTypeInfo
from baiduads.advice.model.pa_idea_template_type import PaIdeaTemplateType
from baiduads.advice.model.picture_type import PictureType
from baiduads.advice.model.predict_effect import PredictEffect
from baiduads.advice.model.price_ratio_effect_info import PriceRatioEffectInfo
from baiduads.advice.model.product_segment_info import ProductSegmentInfo
from baiduads.advice.model.product_segment_type import ProductSegmentType
from baiduads.advice.model.program_elements_type import ProgramElementsType
from baiduads.advice.model.query_detail_request_wrapper import QueryDetailRequestWrapper
from baiduads.advice.model.query_detail_response_wrapper import QueryDetailResponseWrapper
from baiduads.advice.model.query_detail_response_wrapper_body import QueryDetailResponseWrapperBody
from baiduads.advice.model.query_feed_detail_request_wrapper import QueryFeedDetailRequestWrapper
from baiduads.advice.model.query_feed_detail_response_wrapper import QueryFeedDetailResponseWrapper
from baiduads.advice.model.query_feed_detail_response_wrapper_body import QueryFeedDetailResponseWrapperBody
from baiduads.advice.model.query_feed_outline_request_wrapper import QueryFeedOutlineRequestWrapper
from baiduads.advice.model.query_feed_outline_response_wrapper import QueryFeedOutlineResponseWrapper
from baiduads.advice.model.query_feed_outline_response_wrapper_body import QueryFeedOutlineResponseWrapperBody
from baiduads.advice.model.recommend_reason_type import RecommendReasonType
from baiduads.advice.model.target_package_accept_campaign import TargetPackageAcceptCampaign
from baiduads.advice.model.target_package_dataflow_info import TargetPackageDataflowInfo
from baiduads.advice.model.video_type import VideoType
