"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.creativefeed.model.recm_reason_api_request import RecmReasonApiRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['RecmReasonApiRequest'] = RecmReasonApiRequest
from baiduads.creativefeed.model.query_recommend_reasons_request_wrapper import QueryRecommendReasonsRequestWrapper


class TestQueryRecommendReasonsRequestWrapper(unittest.TestCase):
    """QueryRecommendReasonsRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testQueryRecommendReasonsRequestWrapper(self):
        """Test QueryRecommendReasonsRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = QueryRecommendReasonsRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
