"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.advice.model.advice_detail_query_request import AdviceDetailQueryRequest
from baiduads.common.model.api_request_header import ApiRequestHeader
globals()['AdviceDetailQueryRequest'] = AdviceDetailQueryRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
from baiduads.advice.model.query_detail_request_wrapper import QueryDetailRequestWrapper


class TestQueryDetailRequestWrapper(unittest.TestCase):
    """QueryDetailRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testQueryDetailRequestWrapper(self):
        """Test QueryDetailRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = QueryDetailRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
